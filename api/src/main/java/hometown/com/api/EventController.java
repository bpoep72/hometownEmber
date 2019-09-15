package hometown.com.api;

import hometown.com.api.models.Event;
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
@RequestMapping("/events")
public class EventController {
	@Autowired
	private EventRepository repository;
	
	//get all
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Event> getAllEvents()
	{
		return repository.findAll();
	}
	
	//get one
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Event getEventById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}
}