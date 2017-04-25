package Objects;

import java.util.ArrayList;
import java.util.List;

import Shopping.ShoppingCartObserver;
import Shopping.ShoppingCartSubject;

public class Item implements ShoppingCartSubject {

	int codeNumber;
	double price;
	private List<ShoppingCartObserver> observers;

	public Item(int codeNumber, double price) {
		this.codeNumber = codeNumber;
		this.price = price;
		this.observers = new ArrayList<ShoppingCartObserver>();
	}

	public int getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(int codeNumber) {
		this.codeNumber = codeNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		this.doNotify("Change");
	}

	public void displayInformation() {

		System.out.println("Item number = " + this.codeNumber + ",Price = " + this.price);

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
