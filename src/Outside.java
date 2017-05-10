import java.util.Map;

public class Outside extends Space{

	public Outside(String name, int turns, Map<String, Items> inventory) {
		super(name, turns, inventory);
		items.put("harness", new harness());
	}

}
