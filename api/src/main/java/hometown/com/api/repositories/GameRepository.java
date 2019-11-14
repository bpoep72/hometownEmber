package hometown.com.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import hometown.com.api.models.Games;

public interface GameRepository extends MongoRepository<Games, String> {
	
	Games findBy_id(ObjectId _id);
}
