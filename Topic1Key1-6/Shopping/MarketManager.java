package Shopping;

public class MarketManager implements ShoppingCartObserver {

	@Override
	public void doUpdate(String update) {
		if (update.equals("New")) {
			System.out.println("A new item/offer is added, sending mails notifications");
		}
		if (update.equals("Change")) {
			System.out.println("A price is changed, sending mails notifications");
		}
		if (update.equals("Pay")) {
			System.out.println("A new transaction was made, sending mails notifications");
		}

	}

}
