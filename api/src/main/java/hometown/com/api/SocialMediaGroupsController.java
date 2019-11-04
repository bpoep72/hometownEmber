package hometown.com.api;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hometown.com.api.models.SocialMediaGroups;
import hometown.com.api.repositories.SocialMediaGroupsRepository;

@RestController
public class SocialMediaGroupsController {
	
	private final SocialMediaGroupsRepository repository;

	public SocialMediaGroupsController(SocialMediaGroupsRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/socialMediaGroups")
	List<SocialMediaGroups> all()
	{
		return repository.findAll();
	}
	
	@GetMapping("/socialMediaGroups/{id}")
	public SocialMediaGroups one(@PathVariable ObjectId id)
	{
		return repository.findBy_id(id);
	}

}
