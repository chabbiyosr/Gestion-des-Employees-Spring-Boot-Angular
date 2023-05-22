package tn.itbs.tpSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.itbs.tpSpringBoot.entity.Employee;
import tn.itbs.tpSpringBoot.repository.CompanyRepository;
import tn.itbs.tpSpringBoot.repository.EmployeeCompanyRepository;
import tn.itbs.tpSpringBoot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;
	@Autowired
    private CompanyRepository comprepo;
	@Autowired
    private EmployeeCompanyRepository empcomprepo;
	
	//public void save(Employee e, long ide) {
		//employeerepo.save(e);
		//classeRepo.delete(cl);
		//e.setNom("yosr");
		
	//}
	public void save(Employee e) {
		emprepo.save(e); }
	
		
	public List<Employee>  findAll(){
		return emprepo.findAll();
	}
}
