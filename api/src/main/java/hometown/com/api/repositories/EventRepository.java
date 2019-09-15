package hometown.com.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import hometown.com.api.models.Event;

public interface EventRepository extends MongoRepository<Event, String> {
	
	Event findBy_id(ObjectId _id);
}
