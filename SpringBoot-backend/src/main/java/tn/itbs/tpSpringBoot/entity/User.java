package tn.itbs.tpSpringBoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Users")
public class User {
	
	    @Id
	    @Column(name="user_id", length = 45)
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    
	    @Column(name="login", length = 255)
	    private String login;
	 
	    @Column(name="user_name", length = 255)
	    private String username;
	 
	 
	    @Column(name="password", length = 255)
	    private String password;


		public String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}


		public User() {
			
		}


		public User(int id, String login, String username, String password) {
			super();
			this.id = id;
			this.login = login;
			this.username = username;
			this.password = password;
		}
		
			    
}