package tn.itbs.tpSpringBoot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.itbs.tpSpringBoot.entity.Company;
import tn.itbs.tpSpringBoot.exception.ResourceNotFoundException;
import tn.itbs.tpSpringBoot.repository.CompanyRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2/")
public class CompanyController {

	@Autowired
	private CompanyRepository Comrepo;
	
	// get all employees
	@GetMapping("/companies")
	public List<Company> getAllCompanies(){
		return Comrepo.findAll();
	}		
	
	// create company rest api
	@PostMapping("/companies")
	public Company createCompanies(@RequestBody Company company) {
		return Comrepo.save(company);
	}
	
	// get company by id rest api
	@GetMapping("/companies/{id}")
	public ResponseEntity<Company> getCompanyById(@PathVariable Long idc) {
		Company company = Comrepo.findById(idc)
				.orElseThrow(() -> new ResourceNotFoundException("Company not exist with id :" + idc));
		return ResponseEntity.ok(company);
	}
	
	// update company rest api
	
	@PutMapping("/companies/{id}")
	public ResponseEntity<Company> updatecompany(@PathVariable Long idc, @RequestBody Company companyDetails){
		Company company = Comrepo.findById(idc)
				.orElseThrow(() -> new ResourceNotFoundException("Company not exist with id :" + idc));
		
		company.setNom(companyDetails.getNom());
		company.setAdresse(companyDetails.getAdresse());
		
		Company updatedCompany = Comrepo.save(company);
		return ResponseEntity.ok(updatedCompany);
	}
	
	// delete company rest api
	@DeleteMapping("/companies/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteCompany(@PathVariable Long idc){
		Company company = Comrepo.findById(idc)
				.orElseThrow(() -> new ResourceNotFoundException("Company not exist with id :" + idc));
		
		Comrepo.delete(company);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}
