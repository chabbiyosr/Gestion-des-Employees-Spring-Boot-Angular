package tn.itbs.tpSpringBoot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import tn.itbs.tpSpringBoot.repository.UserRepo;
import tn.itbs.tpSpringBoot.DTO.LoginDTO;
import tn.itbs.tpSpringBoot.DTO.UserDTO;
import tn.itbs.tpSpringBoot.Response.LoginResponse;
import tn.itbs.tpSpringBoot.entity.User;

import java.util.Optional;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDTO userdto;

    public LoginResponse loginUser(LoginDTO loginDTO) {
    	String msg="";
    	User user1= userRepo.findByLogin(loginDTO.getLogin());
    	
    	if(user1 != null) {
    		String password = loginDTO.getPassword();
    		String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findOneByLoginAndPassword(loginDTO.getLogin(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
 
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }

    @Override
    public String ajouter(UserDTO userdto) {
        User user = new User(
                userdto.getUserid(),
                userdto.getLogin(),
                userdto.getUsername(),
                this.passwordEncoder.encode(userdto.getPassword())
        );

        userRepo.save(user);

        return user.getUsername();
    }

    @Autowired
    public void setUserdto(UserDTO userdto) {
        this.userdto = userdto;
    }
}
