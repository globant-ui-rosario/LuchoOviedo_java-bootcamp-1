package finalproject.services;

import finalproject.model.ShoppingCart;
import org.springframework.stereotype.Service;

@Service
public interface ShoppingCartService {

    ShoppingCart getACart (Integer userid);

    void addProduct (Integer userid, Integer productcodenumber);

    void saveCart (Integer userid);

}
