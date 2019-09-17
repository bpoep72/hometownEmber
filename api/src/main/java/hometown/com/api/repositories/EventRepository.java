package hometown.com.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import hometown.com.api.models.Events;

public interface EventRepository extends MongoRepository<Events, String> {
	
	Events findBy_id(ObjectId _id);
}
