package finalproject.repositories;

import finalproject.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{

    Product findByProductnameAndCategory (String productname, String category);
}
