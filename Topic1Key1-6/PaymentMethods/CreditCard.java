package PaymentMethods;

import Shopping.ShoppingCart;

public class CreditCard implements PayMethod {

	@Override
	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber) {
		System.out.println("Method used : CreditCard");
		System.out.println("Total amount payable = " + this.getTotal(shoppingCart) + " , User name = "
				+ shoppingCart.getUser().getName() + ", Credit Card Number = "
				+ shoppingCart.getUser().getCreditNumber());
		System.out.println("Payment Transaction " + paymentTransactionNumber);

	}

	@Override
	public double getTotal(ShoppingCart shoppingCart) {
		return (shoppingCart.getTotal()- (shoppingCart.getTotal() * 0.1));
	}

}
