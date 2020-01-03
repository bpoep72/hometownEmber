package hometown.com.api.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import hometown.com.api.models.Users;

public interface UserRepository extends MongoRepository<Users, String> {
	
	Users findByid(ObjectId id);
	Users findByUsername(String username);
}
