import java.util.HashMap;

public class Penthouse extends Space {
	public Penthouse(HashMap<String, Items> inventory) {
		super("Penthouse",  inventory);
		items.put("flashlight ", new FlashLight());
		items.put("dead gold fish ", new DeadGoldFish());
		items.put("swiss army knife ", new SwissArmyKnife());
		items.put("first aid kit ", new FirstAidKit());
		System.out.println(
				"Your head hurts. Your're lying on the bloody floor. You have trouble breathing. You can't get up. You don't know what's happening. You're hungover.\n"
						+ "You try to move. Your body hurts. You feel nauseous. You throw up. You pass out. Five minutes later, you finally regain some consiousness. ");
	}

	public Space go(String direction) {
		if (direction.equals("north ")) {
			System.out.println("You just banged your head on the wall. Be careful!");
			return this;
		} else if (direction.equals("south ")) {
			System.out.println("You really need to know where you're going.");
			return this;
		} else if (direction.equals("east ")) {
			System.out.println("Are you serious? You dont have any sense of direction.");
			return this;
		} else if (direction.equals("west ")) {
			if (this.inventory.containsKey("first aid kit ") && this.inventory.containsKey("swiss army knife ")) {
				if (((SwissArmyKnife) this.inventory.get("swiss army knife ")).used()
						&& ((FirstAidKit) this.inventory.get("first aid kit ")).used()) {
					return new Elevator(inventory);
				} else {
					System.out.println(
							"You probably need to explore more before you leave. Make sure you have gotten rid of the headache first. Also the elevator door might be jammed. "
									+ "Think of a way to open it.");
					return this;
				}
			} else {
				System.out.println(
						"You probably need to explore more before you leave. Make sure you have gotten rid of the headache first. Also the elevator door might be jammed. "
								+ "Think of a way to open it.");
				return this;
			}
		} else {
			System.out.println("That's not even a direction!");
			return this;
		}
	}

}
