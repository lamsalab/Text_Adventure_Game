import java.util.Map;

public class CasinoFloor extends Space {
	

	public CasinoFloor(Map<String, Items> inventory) {
		super("CasinoFloor", 0, inventory);
		Items vodka = new Vodka();
		items.put("vodka", vodka);
		System.out.println("As you enter the casino floor you notice a gaping hole in the center of the floor."
				+ " You approach the hole and see the basement directly beneath you."
				+ " Now would be a good time to have a rope.");
		if (((Vodka) vodka).used()) {
			System.out.println("The vodka starts to kick in as you lean over the hole."
					+ " You loose your balance and fall to the basement." + " You land on our head as your neck snaps."
					+ " That is the last sound you hear as everything turns black.");
			System.exit(0);
		}
		if (((Rope) inventory.get("rope")).used()) {
			basement();
		}
	}

	public Space basement() {
		return new Basement(inventory);
	}

	public Space go(String direction) {
		if (direction.equals("north ")) {
			System.out.println("You take a step forward and fall into the hole. "
					          +"You land on our head as your neck snaps."
						      +" That is the last sound you hear as everything turns black.");
			System.exit(0);
			return null;
		} else if (direction.equals("south ")) {
			System.out.println("You really need to know where you're going.");
			return null;
		} else if (direction.equals("east ")) {
			System.out.println("You take a step forward and fall into the hole. "
			                   +"You land on our head as your neck snaps."
				               +" That is the last sound you hear as everything turns black.");
			System.exit(0);
			return null;
		} else if (direction.equals("west ")) {
			System.out.println("You take a step forward and fall into the hole. "
			                   +"You land on our head as your neck snaps."
				               +" That is the last sound you hear as everything turns black.");
			System.exit(0);
			return null;
		} else {
			System.out.println("That's not even a direction!");
			return null;
	}
	}
}
