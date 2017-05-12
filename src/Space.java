
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Space {
	public Map<String, Items> items;
	public Map<String, Items> inventory;
	public String name;


	public Space(String name, Map<String, Items> inventory) {
		this.name = name;
		items = new HashMap<String, Items>();
		this.inventory = inventory;
	}

	// http://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
	public void lookAround() {
		System.out.println(
				"The place is surrounded by various mesmerizing items. Here are the items that are  within your range of vision: ");
		Iterator<Entry<String, Items>> it = items.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Items> pair = it.next();
			System.out.println(pair.getKey().toString() + " - " + pair.getValue().description());
		}
	
	}

	public void pickUp(String item) {
		item = item.toLowerCase();
		if (items.containsKey(item)) {
			Items picked = items.get(item);
			picked.pickup();
			System.out.println(items.get(item).getName() + "has been added to your inventory.");
			inventory.put(picked.getName().toLowerCase(), picked);
			items.remove(item);
		} else {
			System.out.println("You must be hallucinating because you realize this item isnt in the room");
		}
	

	}

	public void drop(String item) {
		item = item.toLowerCase();
		if (inventory.containsKey(item)) {
			Items temp = inventory.get(item);
			System.out.println("You dropped " + temp.getName());
			inventory.remove(item);
			items.put(item, temp);
		} else {
			System.out.println("You can't quite drop something you don't have now can you?");
		}
	
	}

	public void Wait() {
		System.out.println(
				"Exhausted you let yourself sink to the floor to think things through. As horrifying as this day has been you realize that you are ok\n"
						+ "here in the " + this.name
						+ " you let yourself fade into sleep. Then, you suddenly wake up with a jolt.");
		

	}

	public void use(String item) {
		if (inventory.containsKey(item)) {
			Items usable = inventory.get(item);
			usable.use();
		} else {
			System.out.println("You do not have this item in the inventory.");
		}
		
	}

	public Space go(String direction) {
		return null;
	}

	public void giveUp() {
		System.out.println("It's all too much for you. Why bother with this mess? You pull cyanaide pills out of your pocket and kill yourself");
		System.exit(0);
	}

	public void help(){
		System.out.println("These are the possible commands:\n"
				+ "Wait: wait in the room for one turn\n"
				+ "Go <direction>: go in the given cardinal direction, e.g., north or south\n"
				+ "Pick up <item>: pick up the given item found in the room\n"
				+ "Use <item>: use the given item found in the player’s inventory\n"
				+ "Look around: look at the objects in the room\n"
				+ "Drop <item>: drop the item\n"
				+ "Give up: suicide\n"
				+ "Inventory: print the list of items you have in your inventory\n"
				+ "Help: prints out a list of commands");
		
	}
	
	public void inventory(){
		Iterator<Entry<String, Items>> it = inventory.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Items> pair = it.next();
			System.out.println(pair.getKey().toString());
		}
	}
}
