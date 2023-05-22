package tn.itbs.tpSpringBoot.DTO;



public class UserDTO {

	private int userid;
    private String username;
    private String login;
    private String password;
    
	public UserDTO(int userid, String username, String login, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.login = login;
		this.password = password;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", username=" + username + ", login=" + login + ", password=" + password
				+ "]";
	}
	
	
    
    
}
