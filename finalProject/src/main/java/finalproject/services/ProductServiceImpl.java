package finalproject.services;

import finalproject.model.Product;
import finalproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public Product findByProductnameAndCategory (String productname, String category){
        return productRepository.findByProductnameAndCategory(productname, category);
    }

}
