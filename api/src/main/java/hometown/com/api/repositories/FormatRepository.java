package hometown.com.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import hometown.com.api.models.Formats;

public interface FormatRepository extends MongoRepository<Formats, String> {
	
	Formats findBy_id(ObjectId _id);
}
