package hometown.com.api;

import hometown.com.api.models.Events;
import hometown.com.api.repositories.EventRepository;

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
public class EventController {
	
	private final EventRepository repository;
	
	EventController(EventRepository repository) 
	{
		this.repository = repository;
	}
	
	//get all
	@GetMapping("/events")
	public List<Events> getAllEvents()
	{
		return repository.findAll();
	}
	
	//get one
	@GetMapping("/events/{id}")
	public Events getEventById(@PathVariable("id") ObjectId id) 
	{
		return repository.findBy_id(id);
	}
}
