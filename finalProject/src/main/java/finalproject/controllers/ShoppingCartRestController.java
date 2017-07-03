package finalproject.controllers;

import finalproject.model.ShoppingCart;
import finalproject.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartRestController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping(method = RequestMethod.GET, value = "/{userid}/shoppingCart")
    public ShoppingCart getAshoppingCart(@PathVariable int userid) {

        return shoppingCartService.getACart(userid);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{userid}/shoppingCart/addProduct/{productid}")
    public void addProduct(@PathVariable int userid, @PathVariable int productid) {

        shoppingCartService.addProduct(userid, productid);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{userid}/shoppingCart/save")
    public void addCart(@PathVariable int userid) {

        shoppingCartService.saveCart(userid);

    }



}
