package hometown.com.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import hometown.com.api.models.Hours;

public interface HourRepository extends MongoRepository<Hours, String> {
	
	Hours findBy_id(ObjectId _id);
}
