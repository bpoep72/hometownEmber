package hometown.com.api;

import hometown.com.api.models.Events;
import hometown.com.api.repositories.EventRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.List;
import org.bson.types.ObjectId;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EventController {
	
	private final EventRepository repository;
	
	EventController(EventRepository repository) 
	{
		this.repository = repository;
	}
	
	//get all
	@GetMapping("/events")
	public String getAllEvents() throws JsonProcessingException
	{
		List<Events> events = repository.findAll();
		
		ObjectMapper objectMapper = new ObjectMapper();
		String arrayToJson = objectMapper.writeValueAsString(events);
		
		return arrayToJson;
	}
	
	//get one
	@GetMapping("/events/{id}")
	public Events getEventById(@PathVariable("id") ObjectId id) 
	{
		return repository.findByid(id);
	}
}
