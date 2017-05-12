
import java.util.Map;

public class Elevator extends Space {

	public Elevator(Map<String, Items> inventory) {
		super("Elevator", inventory);
		items.put("cellphone ", new Cellphone());
		items.put("id ", new ID());
		items.put("buttons ", new Buttons());
		inventory.remove("swiss army knife ");
		System.out.println("The elevator opens up and you let yourself in. It's unbelievable that \n"
				+ "everything seems in order. You need to get to the basement before time runs out.\n"
				+ "But, then you notice a corpse lying slumped in the corner. \n"
				+ "and notice some items that may be of use");
	}

	/**
	 * @param direction a String
	 * @return  a Space
	 */
	public Space go(String direction) {
		if (direction.equals("west ")) {
			System.out.println("You just banged your head on the door. Be careful!");
			return this;
		} else if (direction.equals("east ")) {
			System.out.println("You really need to know where you're going.");
			return this;
		} else if (direction.equals("south ")) {
			System.out.println("Are you serious? You dont have any sense of direction.");
			return this;
		} else if (direction.equals("north ")) {
			if (((Buttons) inventory.get("buttons ")).used()) {
				return new Stairwell(inventory);
			} else {
				System.out.println("Try using the buttons before going North.");
				return this;
			}
		} else {
			System.out.println("That's not even a direction!");
			return this;
		}
	}

}