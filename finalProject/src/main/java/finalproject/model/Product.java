package finalproject.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "codenumber")
    private int codenumber;

    @Column(name = "productname")
    private String productname;

    @Column(name = "category")
    private String category;

    @ManyToMany
    @JsonBackReference
    @JoinTable(name = "sale", joinColumns = @JoinColumn(name = "codenumber", referencedColumnName = "codenumber"), inverseJoinColumns = @JoinColumn(name = "cartid", referencedColumnName = "cartid"))
    private List<ShoppingCart> shoppingcarts = new ArrayList<ShoppingCart>();

    public int getCodeNumber() {
        return codenumber;
    }

    public void setCodeNumber(int codenumber) {
        this.codenumber = codenumber;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<ShoppingCart> getShoppingcarts() {
        return shoppingcarts;
    }

    public void setShoppingcarts(List<ShoppingCart> shoppingcarts) {
        this.shoppingcarts = shoppingcarts;
    }

}
