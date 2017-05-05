package Objects;

import java.util.ArrayList;
import java.util.List;

public class Items {

	private List<Item> items;

	public Items() {
		this.items = new ArrayList<Item>();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void add(Item item) {
		items.add(item);
	}

	public Item remove(Item item) {
		Item deletedItem = null;
		for (Item selectedItem : items) {
			if (selectedItem.getCodeNumber() == (item.getCodeNumber())) {
				deletedItem = selectedItem;
				items.remove(selectedItem);
				break;
			}
		}
		return deletedItem;

	}

	public int size() {
		return items.size();
	}

	public Item get() {
		return items.get(0);

	}

}
