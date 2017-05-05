package Shopping;

import java.util.ArrayList;
import java.util.List;

import Objects.Item;
import Objects.Items;
import Objects.Offers;
import Objects.User;
import PaymentMethods.PayMethod;
import PaymentMethods.PaymentTransaction;

public class ShoppingCart implements ShoppingCartSubject {

	private User user;
	private PayMethod payment;
	private Items buyingcart;
	private List<ShoppingCartObserver> observers;

	public ShoppingCart() {
		this.buyingcart = new Items();
		this.payment = null;
		this.user = new User();
		this.observers = new ArrayList<ShoppingCartObserver>();
	}

	public ShoppingCart(Items buyingcart, User user) {
		this.buyingcart = buyingcart;
		this.user = user;
		this.payment = null;
		this.observers = new ArrayList<ShoppingCartObserver>();
	}

	public void buyItem(Item item) {

		this.buyingcart.add(item);
		this.doNotify("New");

	}

	public void buyingOffers(Offers offer) {
		Items items = offer.getItems();
		for (Item item : items.getItems()) {
			buyingcart.add(item);
		}
		this.doNotify("New");
	}

	public Item removeItem(Item item) {
		return buyingcart.remove(item);
	}

	public double getTotal() {
		double total = 0;
		for (Item item : buyingcart.getItems()) {
			total += item.getPrice();
		}
		return total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PayMethod getPayment() {
		return payment;
	}

	public void setPayment(PayMethod payment) {
		this.payment = payment;
	}

	public Items getItems() {
		return buyingcart;
	}

	public void setItems(Items items) {
		this.buyingcart = items;
	}

	public Item expensiveItem() {
		Item expensiveItem = this.buyingcart.get();
		for (Item item : buyingcart.getItems()) {
			if (item.getPrice() > expensiveItem.getPrice()) {
				expensiveItem = item;
			}
		}
		return expensiveItem;
	}

	public Item cheapestItem() {
		Item cheapestItem = this.buyingcart.get();
		for (Item item : buyingcart.getItems()) {
			if (item.getPrice() < cheapestItem.getPrice()) {
				cheapestItem = item;
			}
		}
		return cheapestItem;
	}

	public void pay(PaymentTransaction transaction) {

		if (this.payment == null) {

			System.out.println("Error! Need a valid payment method");

		} else {

			this.payment.pay(this, transaction.newTransaction());

		}

	}

	public void displayItems() {

		for (Item item : buyingcart.getItems()) {
			item.displayInformation();
		}
	}

	@Override
	public void addObserver(ShoppingCartObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(ShoppingCartObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void doNotify(String notification) {

		for (ShoppingCartObserver observer : this.observers) {
			observer.doUpdate(notification);
		}

	}
}
