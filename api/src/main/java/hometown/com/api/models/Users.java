package hometown.com.api.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Users {
	
	public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

	public Users() {
		super();
	}
	
	public Users(String username, String password, String email, String verified, List<String> roles) {
		this.username = username;
		this.password = PASSWORD_ENCODER.encode(password);
		this.email = email;
		this.verified = Boolean.parseBoolean(verified);
		this.roles = roles;
	}
	
	@Id
	public String id;
	
	public String username;
	public String email;
	public boolean verified;
	
	//ignore should prevent the return of the password from the database when the route is accessed
	@JsonIgnore
	public String password;
	@JsonIgnore
	public List<String> roles;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isVerified_email() {
		return verified;
	}
	public void setVerified_email(boolean verified_email) {
		this.verified = verified_email;
	}

	public List<String> getRoles() {
		return roles;
	}
	
}
