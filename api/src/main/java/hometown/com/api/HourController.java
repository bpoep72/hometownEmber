package hometown.com.api;

import hometown.com.api.models.Hours;
import hometown.com.api.repositories.HourRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.bson.types.ObjectId;

@RestController
public class HourController {
	
	private final HourRepository repository;
	
	HourController(HourRepository repository) 
	{
		this.repository = repository;
	}
	
	//get all
	@GetMapping("/hours")
	public List<Hours> getAllHours()
	{
		return repository.findAll();
	}
	
	//get one
	@GetMapping("/hours/{id}")
	public Hours getHourById(@PathVariable("id") ObjectId id) 
	{
		return repository.findBy_id(id);
	}
}
