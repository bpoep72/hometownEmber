package hometown.com.api;

import hometown.com.api.models.Games;
import hometown.com.api.repositories.GameRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.bson.types.ObjectId;

@RestController
public class GameController {
	
	private final GameRepository repository;
	
	GameController(GameRepository repository) 
	{
		this.repository = repository;
	}
	
	//get all
	@GetMapping("/games")
	public List<Games> getAllGames()
	{
		return repository.findAll();
	}
	
	//get one
	@GetMapping("/games/{id}")
	public Games getGameById(@PathVariable("id") ObjectId id) 
	{
		return repository.findBy_id(id);
	}
}
