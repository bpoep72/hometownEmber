package hometown.com.api;

import hometown.com.api.models.Users;
import hometown.com.api.repositories.UserRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.bson.types.ObjectId;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	private final UserRepository repository;
	
	public UserController(UserRepository repository)
	{
		this.repository = repository;
	}
	
	@GetMapping("/users/{id}")
	Users one(@PathVariable ObjectId id) {
		return repository.findByid(id);
	}

}
