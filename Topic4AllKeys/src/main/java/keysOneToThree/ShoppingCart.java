package keysOneToThree;

import java.util.List;

public interface ShoppingCart {

	public List<Item> getAlistOfItems();

	public void addAlistOfItems(List<Item> items);

	public void setTheUser(User user);

	public User getTheUser();

	public void addItemToCart(Item item);

	public void removeItemFromCart(Item item);

	public Item getItemFromCart(Item item);

	public double getTotalAmount();

}
