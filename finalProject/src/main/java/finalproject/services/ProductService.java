package finalproject.services;

import finalproject.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    Product findByProductnameAndCategory (String productname, String category);
}
