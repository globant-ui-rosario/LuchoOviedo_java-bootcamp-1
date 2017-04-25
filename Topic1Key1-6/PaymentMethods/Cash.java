package PaymentMethods;

import Shopping.ShoppingCart;

public class Cash implements PayMethod {

	@Override
	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber) {
		System.out.println("Method used : Cash");
		System.out.println("Total amount payable = " + this.getTotal(shoppingCart));
		System.out.println("Payment Transaction " + paymentTransactionNumber);
		
	}

	@Override
	public double getTotal(ShoppingCart shoppingCart) {
		return (shoppingCart.getTotal() - (shoppingCart.expensiveItem().getPrice() * 0.9));
	}

}
