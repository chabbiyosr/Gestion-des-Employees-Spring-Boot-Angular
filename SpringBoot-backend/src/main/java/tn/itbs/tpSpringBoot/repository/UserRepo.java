package tn.itbs.tpSpringBoot.repository;

import tn.itbs.tpSpringBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	Optional<User> findOneByLoginAndPassword(String login, String password);

    User findByLogin(String login);


    

}
