package Objects;

import java.util.ArrayList;
import java.util.List;

import Shopping.ShoppingCartObserver;
import Shopping.ShoppingCartSubject;

public class Offers implements ShoppingCartSubject {

	private String offerCode;
	private double price;
	private Items offersitems;
	private List<ShoppingCartObserver> observers;

	public Offers(String code) {

		this.offerCode = code;
		this.price = 0;
		this.offersitems = new Items();
		this.observers = new ArrayList<ShoppingCartObserver>();
	}

	public void addItem(Item item) {

		offersitems.add(item);
		this.doNotify("New");
		
	}

	public void deleteItem(Item item) {

		offersitems.remove(item);

	}

	public double getPrice() {
		if (this.price != 0) {
			return this.price;
		} else {
			double price = 0;
			for (Item item : offersitems.getItems()) {
				price += item.getPrice();
			}
			return price;
		}
	}

	public Items getItems() {
		return offersitems;
	}

	public void setPrice(double price) {
		this.price = price;
		this.doNotify("Change");
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String code) {
		this.offerCode = code;
	}

	public void displayInformation() {
		System.out.println("Offer number: " + this.getOfferCode() + ", Price of the Offer=" + this.getPrice());
		System.out.println("Items in the Offer :");
		for (Item item : offersitems.getItems()) {
			item.displayInformation();
		}
	}

	@Override
	public void addObserver(ShoppingCartObserver sco) {
		this.observers.add(sco);
	}

	@Override
	public void removeObserver(ShoppingCartObserver sco) {
		this.observers.remove(sco);
	}

	@Override
	public void doNotify(String notification) {
		for (ShoppingCartObserver observer : this.observers) {
			observer.doUpdate(notification);
		}

	}

}
