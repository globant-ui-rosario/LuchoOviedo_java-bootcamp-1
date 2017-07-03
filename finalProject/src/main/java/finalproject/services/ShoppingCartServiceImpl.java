package finalproject.services;

import finalproject.model.Product;
import finalproject.model.ShoppingCart;
import finalproject.repositories.ProductRepository;
import finalproject.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private Map<Integer, ShoppingCart> shoppingCarts;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartServiceImpl() {

        this.shoppingCarts = new HashMap<>();
    }

    @Override
    public void addProduct(Integer userid, Integer productid) {

        ShoppingCart shoppingCart = getACart(userid);
        if (shoppingCart != null) {
            Product product = productRepository.findOne(productid);
            if (product != null) {
                shoppingCart.getProducts().add(product);
            }

        }
    }

    @Override
    public void saveCart(Integer userid) {
        if (getACart(userid) != null) {
            shoppingCartRepository.save(shoppingCarts.get(userid));
            shoppingCarts.remove(userid);
        }
    }

    @Override
    public ShoppingCart getACart(Integer userid) {
        if (userService.isOn(userid)) {
            if (shoppingCarts.containsKey(userid)) {
                return shoppingCarts.get(userid);
            } else {
                shoppingCarts.put(userid, new ShoppingCart());
                return shoppingCarts.get(userid);
            }
        }
        return null;
    }

}
