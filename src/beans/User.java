package beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


 @ManagedBean 
public class User {
	public String userName;
	public String password;
	public String fullName;
	public String email;
	
	
	
	public User() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	
}


