package Shopping;

public interface ShoppingCartSubject {

	public void addObserver(ShoppingCartObserver shoppingObserver);

	public void removeObserver(ShoppingCartObserver shoppingObserver);

	public void doNotify(String notification);
	
}
