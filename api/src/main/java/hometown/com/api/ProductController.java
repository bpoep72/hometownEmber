package hometown.com.api;

import hometown.com.api.models.Products;
import hometown.com.api.repositories.ProductRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.bson.types.ObjectId;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {
	
	private final ProductRepository repository;
	
	ProductController(ProductRepository repository) 
	{
		this.repository = repository;
	}
	
	//get all
	@GetMapping("/products")
	public List<Products> getAllProducts()
	{
		return repository.findAll();
	}
	
	//get one
	@GetMapping("/products/{id}")
	public Products getProductById(@PathVariable("id") ObjectId id) 
	{
		return repository.findByid(id);
	}
}
