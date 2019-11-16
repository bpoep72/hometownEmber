package hometown.com.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import hometown.com.api.models.SocialMediaGroups;

public interface SocialMediaGroupsRepository extends MongoRepository<SocialMediaGroups, String> {
	
	SocialMediaGroups findByid(ObjectId id);
}
