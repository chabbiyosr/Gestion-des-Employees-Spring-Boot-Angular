package tn.itbs.tpSpringBoot.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Data 
@Entity

public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idc;
	private String nom;
	private String adresse;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cm")
	private List<Employeecompany> ListL = new ArrayList<Employeecompany>();
	

}
