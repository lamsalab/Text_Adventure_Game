
import java.util.Map;

public class Stairwell extends Space {
	public Stairwell(Map<String, Items> inventory) {
		super("Stairwell", inventory);
		inventory.remove("buttons ");
		items.put("rope ", new Rope());
		items.put("flare ", new Flare());

		System.out.println("You fling yourself from the elevator cutting your feet on the glass as \n"
				+ "you do. As you land hard on the floor the elevator gives way behind you and continues down the \n"
				+ "chute. You make out the enormous thud as it crashes. You wouldn't have survived the fall. \n"
				+ "You stop to remove the pieces of glass lodged in your feet. At this point pain is\n"
				+ "irrelevant. You take a look around you and notice something strange about this \n"
				+ "stairwell. It is one of those fancy stair wells with carpeting on the walls and floor \n"
				+ "it must be the stairs that guests use whne they don't want to use the elevator. Despite \n"
				+ "power going out there is a red glow a few feet from you, the only light and it is accompanied \n"
				+ "by a hissing sound. flares! There are flares all over the staircase and one of them \n"
				+ "is going off. You also notice a climbing rope hanging off one of the banisters.");
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
