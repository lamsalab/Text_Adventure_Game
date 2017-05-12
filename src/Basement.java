import java.util.Map;

public class Basement extends Space {
	public Basement(Map<String, Items> inventory) {
		super("Basement", inventory);
		inventory.remove("rope ");
		System.out.println(
				"You slowly descend down the rope until you reach the floor. It stinks. Not in the this is a bad day kind of way but in the rotting flesh and faeces kind of way \n"
						+ "You're not even sure if coming down here was the right thing but with the casino door blocked by the hole this is the only way out \n"
						+ "Your feet land in something wet but you don't want to think about it. You need some light. The entire basement is pitch black and has \n"
						+ "a sinister feel to it. ");
	}

	public Space go(String direction) {
		if (this.inventory.containsKey("flashlight ")) {
			if (((FlashLight) inventory.get("flashlight ")).used()) {
				if (direction.equals("north ")) {
					System.out.println(
							"You see a cracked gas pipe behind you and hear hissing. You instinctively jump forward\n"
									+ "There is a large explosion behind you");
					return new Outside(inventory);
				} else if (direction.equals("south ")) {
					System.out.println("There is a wall on this side you cannot go here");
					return this;
				} else if (direction.equals("east ")) {
					System.out.println("The door on this side is jammed shut");
					return this;
				} else if (direction.equals("west ")) {
					System.out.println("This side is blocked by a car");
					return this;
				} else {
					System.out.println("That's not even a direction!");
					return this;
				}
			} else {
				System.out.println(
						"You realize it's too dark for you to do anything useful. With the stench you know something nasty \n"
								+ "is lying around. You remember the handy flashlight you picked up earlier.");
				return this;
			}
		} else {
			System.out.println(
					"The smell is getting worse, you can't see anything and you start to panic. This is all too much. You expel the contents \n"
							+ "of your stomach violently and then hear a sudden loud bang. Pain. It's the last thing you remember as you fade away. Something explodes\n"
							+ "near you. If only you had a source of light on you...");
			System.exit(0);
			return this;
		}
	}

}
