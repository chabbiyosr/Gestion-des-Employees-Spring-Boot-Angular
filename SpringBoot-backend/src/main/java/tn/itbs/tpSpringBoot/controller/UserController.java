package tn.itbs.tpSpringBoot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.itbs.tpSpringBoot.DTO.LoginDTO;
import tn.itbs.tpSpringBoot.DTO.UserDTO;
import tn.itbs.tpSpringBoot.Response.LoginResponse;
import tn.itbs.tpSpringBoot.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	UserService userserv;
	
@PostMapping("/save")
public String save(@RequestBody UserDTO userdto) {
	String id =userserv.ajouter(userdto);
	return id;
}

@PostMapping("/login")
public ResponseEntity<?> login (@RequestBody LoginDTO loginDto){
	LoginResponse loginResponse = userserv.loginUser(loginDto);
	return ResponseEntity.ok(loginResponse);
}
	


}
