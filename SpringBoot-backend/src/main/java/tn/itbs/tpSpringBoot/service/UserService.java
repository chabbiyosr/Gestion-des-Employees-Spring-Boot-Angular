package tn.itbs.tpSpringBoot.service;


import org.springframework.stereotype.Service;

import tn.itbs.tpSpringBoot.DTO.LoginDTO;
import tn.itbs.tpSpringBoot.DTO.UserDTO;
import tn.itbs.tpSpringBoot.Response.LoginResponse;

@Service
public interface UserService {
	
	
	
	
    public LoginResponse loginUser(LoginDTO loginDTO);
     
    public String ajouter(UserDTO userdto);
    
   
}
