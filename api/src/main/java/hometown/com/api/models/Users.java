package hometown.com.api.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "users")
public class Users {
	
	public Users(String username, String password, String email, boolean verified, List<String> roles) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.verified = verified;
		this.roles = roles;
	}
	
	@Id
	public String id;
	
	public String username;
	public String email;
	public boolean verified;
	
	//prevent api access to these fields
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
