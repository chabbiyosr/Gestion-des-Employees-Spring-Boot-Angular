package tn.itbs.tpSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.itbs.tpSpringBoot.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
