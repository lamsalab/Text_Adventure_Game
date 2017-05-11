import java.util.HashMap;

public class Penthouse extends Space {
	public Penthouse(HashMap<String, Items> inventory) {
		super("Penthouse", 0, inventory);
		items.put("flashlight", new FlashLight());
		items.put("deadgoldfish", new DeadGoldFish());
		items.put("swissarmyknife", new SwissArmyKnife());
		System.out.println(
				"Your head hurts. Your're lying on the bloody floor. You have trouble breathing. You can't get up. You don't know what's happening. You're hungover."
						+ "You try to move. Your body hurts. You feel nauseous. You throw up. You pass out. Five miutes later, you finally regain some consiousness. ");
	}

	public Space go(String direction) {
		if (direction.equals("north")) {
			System.out.println("You just banged your head on the wall. Be careful!");
			return null;
		} else if (direction.equals("south")) {
			System.out.println("You really need to know where you're going.");
			return null;
		} else if (direction.equals("east")) {
			System.out.println("Are you serious? You dont have any sense of direction.");
			return null;
		} else if (direction.equals("west")){
			return new Elevator(this.turns, inventory);
		}
		else {
			System.out.println("That's not even a direction!");
			return null;
		}
	}

}
