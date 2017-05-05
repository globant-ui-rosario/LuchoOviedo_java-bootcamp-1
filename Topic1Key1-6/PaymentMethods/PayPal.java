package PaymentMethods;

import Shopping.ShoppingCart;

public class PayPal implements PayMethod {

	@Override
	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber) {
		System.out.println("Method used : PayPal");
		System.out.println("Total amount payable = " + this.getTotal(shoppingCart) + " , User Mail = "
				+ shoppingCart.getUser().getMail() + ", User Password = "
				+ shoppingCart.getUser().getPassword());
		System.out.println("Payment Transaction " + paymentTransactionNumber);
		
	}

	@Override
	public double getTotal(ShoppingCart shoppingCart) {
		return shoppingCart.getTotal() - shoppingCart.cheapestItem().getPrice();
	}
	
	
	
}
