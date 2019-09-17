package hometown.com.api.models;

import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;

public class Users {

	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	public ObjectId _id;
	public String username;
	public String password; //TODO: FIX PLAIN TEXT PASSWORDS BEFORE ACTUAL USE
	public String email;
	public boolean verified_email;
	
	
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
		return verified_email;
	}
	public void setVerified_email(boolean verified_email) {
		this.verified_email = verified_email;
	}
	
	
}
