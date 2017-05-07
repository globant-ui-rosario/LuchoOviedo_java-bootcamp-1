package keysOneToThree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void testGetAndSetListOfItems() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		List<Item> myListOfItems = new ArrayList<Item>();
		for (int i = 0; i <= 10; i++) {
			myListOfItems.add(new Item(i));
		}
		shoppingCart.addAlistOfItems(myListOfItems);
		assertEquals(myListOfItems, shoppingCart.getAlistOfItems());
	}

	@Test
	public void testAddAnItemToTheList() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		Item item = new Item(1);
		shoppingCart.addItemToCart(item);
		assertEquals(shoppingCart.getItemFromCart(item), item);
	}

	@Test
	public void testRemoveAnItemToTheList() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		Item item = new Item(1);
		shoppingCart.addItemToCart(item);
		assertEquals(shoppingCart.getItemFromCart(item), item);
		shoppingCart.removeItemFromCart(item);
		assertEquals(shoppingCart.getItemFromCart(item), null);
	}

	@Test
	public void testGetAndSetAUser() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		User user = new User();
		shoppingCart.setTheUser(user);
		assertEquals(shoppingCart.getTheUser(), user);
	}

	@Test
	public void testGetTotalAmount() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		List<Item> myList = new ArrayList<Item>();
		double myTotal = 0;
		for (int i = 0; i <= 10; i++) {
			myList.add(new Item(1, i));
			myTotal += i;
		}
		shoppingCart.addAlistOfItems(myList);
		assertEquals(new Double(myTotal), new Double(shoppingCart.getTotalAmount()));

	}

}
