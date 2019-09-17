package hometown.com.api.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import hometown.com.api.models.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findBy_id(ObjectId _id);
}
