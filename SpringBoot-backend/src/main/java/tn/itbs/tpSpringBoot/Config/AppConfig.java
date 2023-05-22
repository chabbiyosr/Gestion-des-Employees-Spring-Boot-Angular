package tn.itbs.tpSpringBoot.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tn.itbs.tpSpringBoot.DTO.UserDTO;

@Configuration
public class AppConfig {
    @Bean
    public UserDTO userDTO() {
        return new UserDTO();
    }
}