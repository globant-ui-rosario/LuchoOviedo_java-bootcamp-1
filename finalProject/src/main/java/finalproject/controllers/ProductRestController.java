package finalproject.controllers;

import finalproject.model.Product;
import finalproject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method= RequestMethod.GET, value="/product/{productname}/{category}")
    public Product productByNameAndCategory(@PathVariable String productname, @PathVariable String category) {

        return productService.findByProductnameAndCategory(productname, category);

    }
}
