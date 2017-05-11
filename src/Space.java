
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Space {
	public Map<String, Items> items;
	public Map<String, Items> inventory;
	private String name;
	public int turns;

	public Space(String name, int turns, Map<String, Items> inventory) {
		this.name = name;
		this.turns = turns;
		items = new HashMap<String, Items>();
		this.inventory = inventory;
	}
	
//http://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
	public void lookAround() {
		System.out.println(
				"The place is surrounded by various mesmerizing items. Here the items that is in within your range of vision: ");
		Iterator<Entry<String, Items>> it = items.entrySet().iterator();
	    while (it.hasNext()) {
	        Entry<String, Items> pair = it.next();
	        System.out.println(pair.getKey().toString() + " - " + pair.getValue().description());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    this.turns++;		
	}

	public void pickUp(String item) {
		item = item.toLowerCase();
		System.out.println(item);
		if (items.containsKey(item)) {
			System.out.println("You picked up " + items.get(item).getName());
			Items picked = items.get(item);
			inventory.put(picked.getName(), picked);
			items.remove(item);
		} else {
			System.out.println("You must be hallucinating because you realize this item isnt in the room");
		}
		this.turns++;

	}

	public void drop(String item) {
		item = item.toLowerCase();
		if (inventory.containsKey(item)) {
			System.out.println("You dropped " + items.get(item));
			inventory.remove(item);
		} else {
			System.out.println("You can't quite drop something you don't have now can you?");
		}
		this.turns++;
	}

	public void Wait() {
		System.out.println(
				"Exhausted you let yourself sink to the floor to think things through. As horrifying as this day has been you realize that you are ok "
						+ "here in the " + this.name + " you let yourself fade into sleep. Then, you suddenly wake up with a jolt.");
		this.turns++;

	}

	public void use(String item) {
		if (inventory.containsKey(item)){
		Items usable = inventory.get(item);
		usable.use();
		}
		else {
			System.out.println("You do not have this item in the inventory yet.");
		}
		this.turns++;
	}

	public Space go(String direction) {
		return null;
	}

	public void giveUp() {
		System.out.println("It's all too much for you. Why bother with this mess? You fling yourself out the window.");

	}

}
