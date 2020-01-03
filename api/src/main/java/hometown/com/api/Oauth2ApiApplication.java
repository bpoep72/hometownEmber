package hometown.com.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import hometown.com.api.models.Users;
import hometown.com.api.repositories.UserRepository;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class} )
public class Oauth2ApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (this.userRepository.findByUsername("admin") == null) {
			Users user = new Users("admin", "admin", "a@gmail.com", "true", Arrays.asList("ADMIN"));

			this.userRepository.save(user);
		}
	}

}