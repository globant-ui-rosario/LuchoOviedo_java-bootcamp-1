package PaymentMethods;

import Shopping.ShoppingCart;

public interface PayMethod {

	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber);

	public double getTotal(ShoppingCart shoppingCart);
	
}
