package PaymentMethods;

import java.util.ArrayList;
import java.util.List;

import Shopping.ShoppingCartObserver;
import Shopping.ShoppingCartSubject;

public class PaymentTransaction implements ShoppingCartSubject {

	private int code;
	private List<ShoppingCartObserver> observers;

	public PaymentTransaction() {
		this.code = 0;
		this.observers = new ArrayList<ShoppingCartObserver>();
	}

	public int newTransaction() {

		this.code++;
		this.doNotify("Pay");
		return this.code;

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
