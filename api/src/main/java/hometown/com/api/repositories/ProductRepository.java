package hometown.com.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import hometown.com.api.models.Products;

public interface ProductRepository extends MongoRepository<Products, String> {
	
	Products findBy_id(ObjectId _id);
}
