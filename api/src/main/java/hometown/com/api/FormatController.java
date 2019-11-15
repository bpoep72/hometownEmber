package hometown.com.api;

import hometown.com.api.models.Formats;
import hometown.com.api.repositories.FormatRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.bson.types.ObjectId;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FormatController {
	
	private final FormatRepository repository;
	
	FormatController(FormatRepository repository) 
	{
		this.repository = repository;
	}
	
	//get all
	@GetMapping("/formats")
	public List<Formats> getAllFormats()
	{
		return repository.findAll();
	}
	
	//get one
	@GetMapping("/formats/{id}")
	public Formats getFormatById(@PathVariable("id") ObjectId id) 
	{
		return repository.findBy_id(id);
	}
}
