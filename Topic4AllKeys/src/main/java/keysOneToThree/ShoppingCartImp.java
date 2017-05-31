package keysOneToThree;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImp implements ShoppingCart {

	List<Item> items = new ArrayList<Item>();
	private User user;

	public List<Item> getAlistOfItems() {
		return this.items;
	}

	public void addAlistOfItems(List<Item> items) {
		this.items = items;

	}

	public void setTheUser(User user) {
		this.user = user;

	}

	public User getTheUser() {
		return this.user;
	}

	public void addItemToCart(Item item) {
		this.items.add(item);

	}

	public void removeItemFromCart(Item item) {
		items.remove(item);

	}

	public Item getItemFromCart(Item item) {
		Item itemWanted = null;

		for (Item item2 : items) {

			if (item2.getCodeNumber() == item.getCodeNumber()) {
				itemWanted = item2;
				break;
			}
		}

		return itemWanted;
	}

	public double getTotalAmount() {
		double total = 0;

		for (Item item : items) {
			total += item.getPrice();
		}

		return total;
	}

}
