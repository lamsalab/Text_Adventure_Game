
import java.util.Map;

public class Elevator extends Space {

	public Elevator(Map<String, Items> inventory) {
		super("Elevator", inventory);
		items.put("cellphone ", new Cellphone());
		items.put("id ", new ID());
		items.put("buttons ", new Buttons());
		inventory.remove("swiss army knife ");
		System.out.println("The elevator opens up and you let yourself in. It's unbelievable that it is \n"
				+ "still working. The lights are flickering but everything seems in order. There is a deep \n"
				+ "hum from below the floor but you ignore it. You've been though too much to care, you need \n"
				+ "to get to the basement before time runs out. The glass on the floor barely bothers you \n"
				+ "as you get in and the door shuts behind you.Then you notice the corpse lying slumped in the corner. You look \n"
				+ "and notice it is a man and his ID is right next to him. There also seems to be a cellphone \n"
				+ "next to it. Things are sort of looking up.");
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