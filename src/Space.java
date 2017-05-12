
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Space {
	protected Map<String, Items> items;
	protected Map<String, Items> inventory;
	protected String name;


	public Space(String name, Map<String, Items> inventory) {
		this.name = name;
		items = new HashMap<String, Items>();
		this.inventory = inventory;
	}

	/**
	 * 
	 * @return void
	 */
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

	/**
	 * 
	 * @return void
	 */
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

	/**
	 * 
	 * @return void
	 */
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

	/**
	 * 
	 * @return void
	 */
	public void Wait() {
		System.out.println(
				"Exhausted you let yourself sink to the floor to think things through. As horrifying as this day has been you realize that you are ok\n"
						+ "here in the " + this.name
						+ " you let yourself fade into sleep. Then, you suddenly wake up with a jolt.");
		

	}

	/**
	 * 
	 * @return void
	 */
	public void use(String item) {
		if (inventory.containsKey(item)) {
			Items usable = inventory.get(item);
			usable.use();
		} else {
			System.out.println("You do not have this item in the inventory.");
		}
		
	}

	/**
	 * 
	 * @return void
	 */
	public Space go(String direction) {
		return null;
	}

	/**
	 * 
	 * @return void
	 */
	public void giveUp() {
		System.out.println("It's all too much for you. Why bother with this mess? You pull cyanaide pills out of your pocket and kill yourself");
		System.exit(0);
	}

	/**
	 * 
	 * @return void
	 */
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
	
	/**
	 * 
	 * @return void
	 */
	public void inventory(){
		Iterator<Entry<String, Items>> it = inventory.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Items> pair = it.next();
			System.out.println(pair.getKey().toString());
		}
	}
}
