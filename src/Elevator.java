
import java.util.Map;

public class Elevator extends Space {

	public Elevator(int turns, Map<String, Items> inventory) {
		super("Elevator", turns, inventory);
		items.put("cellphone", new Cellphone());
		items.put("ID", new ID());
		items.put("buttons", new Buttons());
		System.out.println("The elevator opens up and you let yourself in. It's unbelievable that it is "
				+ "still working. The lights are flickering but everything seems in order. There is a deep"
				+ "hum from below the floor but you ignore it. You've been though too much to care, you need"
				+ "to get to the basement before time runs out. The glass on the floor barely bothers you"
				+ "as you get in and the door shuts behind you.Then you notice the corpse lying slumped in the corneer. You look "
				+ "and notice it is a man and his ID is right next to him. There also seems to be a cellphone"
				+ "next to it. Things are sort of looking up");
	}


	public Space go(String direction) {
		if (direction.equals("west")) {
			System.out.println("You just banged your head on the door. Be careful!");
			return null;
		} else if (direction.equals("east")) {
			System.out.println("You really need to know where you're going.");
			return null;
		} else if (direction.equals("south")) {
			System.out.println("Are you serious? You dont have any sense of direction.");
			return null;
		} else if (direction.equals("north")) {
			return new Stairwell(this.turns, inventory);
		} else {
			System.out.println("That's not even a direction!");
			return null;
		}
	}
}