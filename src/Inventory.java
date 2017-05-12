import java.util.HashMap;
import java.util.Map;

public class Inventory {
	public Map<String, Items> items;

	public Inventory() {
		this.items = new HashMap<String, Items>();

	}

	public void check() {
		System.out.println(items.keySet());
	}

	public void add(Items item) {
		items.put(item.getName(), item);

	}

	public void remove(Items item) {
		items.remove(item.getName(), item);
	}

}
