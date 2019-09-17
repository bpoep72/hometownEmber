package hometown.com.api;

import hometown.com.api.models.User;
import hometown.com.api.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.bson.types.ObjectId;

@RestController
public class UserController {

	private final UserRepository repository;
	
	UserController(UserRepository repository)
	{
		this.repository = repository;
	}
	
	//TODO: consider hiding this map
	@GetMapping("/users")
	List<User> all() 
	{
		return repository.findAll();
	}

	@PostMapping("/users")
	User newUser(@RequestBody User newUser) {
		return repository.save(newUser);
	}
	
	@GetMapping("/users/{id}")
	User one(@PathVariable ObjectId id) {
		return repository.findBy_id(id);
	}

}
