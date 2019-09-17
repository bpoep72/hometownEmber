package hometown.com.api;

import hometown.com.api.models.Events;
import hometown.com.api.repositories.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public List<Events> getAllEvents()
	{
		return repository.findAll();
	}
	
	//get one
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Events getEventById(@PathVariable("id") ObjectId id) 
	{
		return repository.findBy_id(id);
	}
}
