package keysOneToThree;

public class Item {

	int codeNumber;
	double price;

	public Item(int codeNumber, double price) {
		this.codeNumber = codeNumber;
		this.price = price;
	}

	public Item(int codeNumber) {
		this.codeNumber = codeNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCodeNumber() {
		return codeNumber;
	}

}
