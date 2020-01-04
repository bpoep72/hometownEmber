package hometown.com.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import hometown.com.api.models.Users;
import hometown.com.api.repositories.UserRepository;

@SpringBootApplication
public class Oauth2ApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ApiApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
	
	@Override
	public void run(String... args) throws Exception {
		if (this.userRepository.findByUsername("admin") == null) {
				
			Users user = new Users("admin", passwordEncoder.encode("admin"), "a@gmail.com", true, Arrays.asList("ADMIN"));

			this.userRepository.save(user);
		}
	}

}