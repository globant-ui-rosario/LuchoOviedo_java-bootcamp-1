package finalproject.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {

    @Id
    @GeneratedValue
    @Column(name = "cartid")
    private int cartId;

    @Column(name = "userid")
    private int userId;

    @ManyToMany
    @JoinTable(name = "sale", joinColumns = @JoinColumn(name = "cartid", referencedColumnName = "cartid"), inverseJoinColumns = @JoinColumn(name = "codenumber", referencedColumnName = "codenumber"))
    private List<Product> products = new ArrayList<Product>();

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
