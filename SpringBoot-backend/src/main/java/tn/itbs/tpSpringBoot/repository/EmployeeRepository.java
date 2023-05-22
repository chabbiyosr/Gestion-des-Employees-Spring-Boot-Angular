package tn.itbs.tpSpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.itbs.tpSpringBoot.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
	 List<Employee> findByFirstName(String firstName); 

}
