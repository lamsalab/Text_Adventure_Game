
import java.util.Map;

public class Stairwell extends Space {
	public Stairwell(Map<String, Items> inventory) {
		super("Stairwell", inventory);
		inventory.remove("buttons ");
		items.put("rope ", new Rope());
		items.put("flare ", new Flare());

		System.out.println("You fling yourself from the elevator into the stairwell and cut your right foot on a piece of glass.\n"
				+ "But, at this point pain is irrelevant. You take a look around you and notice something strange.\n"
				+ "Despite power going out, there is a red glow a few feet away from you. It is the only source of light\n"
				+ "and it is accompanied by a hissing sound. Flares! There are flares scattered all over the place.\n"
				+ "What else could be here?");
	}

	/**
	 * @param direction a String
	 * @return  a Space
	 */
	public Space go(String direction) {
		if (direction.equals("west ")) {
			System.out.println("You just banged your head on the wall. Be careful!");
			return this;
		} else if (direction.equals("south ")) {
			System.out.println("You really need to know where you're going.");
			return this;
		} else if (direction.equals("east ")) {
			System.out.println("Are you serious? You dont have any sense of direction.");
			return this;
		} else if (direction.equals("north ")) {
			System.out.println("You follow the stairs down to the Casino Floor");
			return new CasinoFloor(inventory);
		} else {
			System.out.println("That's not even a direction!");
			return this;
		}
	}

	/**
	 * 
	 * @return void
	 */
	public void use(String item) {
		if (inventory.containsKey(item)) {
			if (item.equals("rope ")) {
				System.out.println("This item cannot be used here.");
			} else {
				Items usable = inventory.get(item);
				usable.use();
			}
		} else {
			System.out.println("You do not have this item in the inventory yet.");
		}

	}
}
