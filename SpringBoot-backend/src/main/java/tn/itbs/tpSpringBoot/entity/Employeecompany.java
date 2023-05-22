package tn.itbs.tpSpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Employeecompany {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idec;
	
	@ManyToOne
	@JoinColumn(name ="idc")
	private Company cm;

	@ManyToOne
	@JoinColumn(name="id")
	private Employee e;
}
