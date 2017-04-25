package Shopping;

import Objects.Item;
import Objects.Offers;
import Objects.User;
import PaymentMethods.Cash;
import PaymentMethods.CreditCard;
import PaymentMethods.PayPal;
import PaymentMethods.PaymentTransaction;

public class Demo {

	public static void main(String[] args) {

		// Creating a Client
		User u1 = new User("Luciano", "36004261", "luchoviedo28@gmail.com", "4643741");

		// Creating items
		Item i1 = new Item(4, 50);
		Item i2 = new Item(53, 100);
		Item i3 = new Item(44, 75);
		Item i4 = new Item(28, 88);
		Item i5 = new Item(74, 125);

		// Creating 1 offer
		Offers offer = new Offers("OFFER003");

		// Creating a ShoppingCart
		ShoppingCart sc = new ShoppingCart();

		// Creating a MarketManager and observer
		MarketManager mm = new MarketManager();
		sc.addObserver(mm);

		sc.setUser(u1);
		sc.buyItem(i5);
		sc.buyItem(i3);
		sc.buyItem(i2);
		sc.buyItem(i4);
		sc.buyItem(i1);

		// Searching the cheapest item
		System.out.println("Cheapest Item: " + sc.cheapestItem().getCodeNumber() + " " + sc.cheapestItem().getPrice());

		// Searching the expensive item
		System.out
				.println("Expensive Item: " + sc.expensiveItem().getCodeNumber() + " " + sc.expensiveItem().getPrice());

		// Showing Total
		System.out.println("Total amount = " + sc.getTotal());

		// Removing Items
		sc.removeItem(i3);
		sc.removeItem(i5);
		System.out.println("Total amount = " + sc.getTotal());

		// Trying Offers
		offer.addItem(i3);
		offer.addItem(i5);
		sc.buyingOffers(offer);
		System.out.println("Total amount = " + sc.getTotal());

		// Trying pay methods
		PaymentTransaction transaction = new PaymentTransaction();
		// Add observers to the payment transaction
		transaction.addObserver(mm);

		// Trying to pay without setting a valid payment method
		sc.pay(transaction);

		// Paying with different methods
		sc.setPayment(new Cash());
		sc.pay(transaction);

		sc.setPayment(new CreditCard());
		sc.pay(transaction);

		sc.setPayment(new PayPal());
		sc.pay(transaction);

		// Showing the items in the cart
		sc.displayItems();

		offer.addObserver(mm);
		i1.addObserver(mm);
		offer.setPrice(4546);
		i1.setPrice(34);
		System.out.println(offer.getPrice());
		System.out.println(i1.getPrice());
	}

}
