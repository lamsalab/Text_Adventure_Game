import java.util.Map;

public class CasinoFloor extends Space {

	private Items vodka = new Vodka();

	public CasinoFloor(Map<String, Items> inventory) {
		super("CasinoFloor", inventory);
		items.put("vodka ", vodka);
		System.out.println("As you enter the casino floor you notice a gaping hole in the center of the floor.\n"
				+ "You approach the large hole in the floor of the room and see the basement directly beneath you.\n"
				+ "Now would be a good time to have a rope.");
	}

	/**
	 * @param direction a String
	 * @return a Space
	 */
	public Space go(String direction) {
		if (((Vodka) vodka).used()) {
			System.out.println("The vodka starts to kick in as you lean over the hole.\n"
					+ "You loose your balance and fall in to the basement."
					+ "You land on our head as your neck snaps.\n"
					+ "That is the last sound you hear as everything turns black.");

			System.exit(0);
			return this;
		} else {
			if (direction.equals("east ")) {
				if (inventory.containsKey("rope ")) {
					if (((Rope) inventory.get("rope ")).used()) {
						return new Basement(inventory);
					} else {
						System.out.println("You make want to use a rope before stepping in the hole");
						return this;
					}
				} else {
					System.out.println("You take a step forward and fall into the hole. \n"
							+ "You land on our head as your neck snaps.\n"
							+ " That is the last sound you hear as everything turns black.\n");
					System.exit(0);
					return this;
				}
			} else if (direction.equals("south ")) {
				System.out.println("You really need to know where you're going.");
				return this;
			} else if (direction.equals("north ")) {
				System.out.println("You take a step forward and fall into the hole. \n"
						+ "You land on our head as your neck snaps.\n"
						+ " That is the last sound you hear as everything turns black.\n");
				System.exit(0);
				return this;
			} else if (direction.equals("west ")) {
				System.out.println("You take a step forward and fall into the hole. \n"
						+ "You land on our head as your neck snaps.\n"
						+ " That is the last sound you hear as everything turns black.\n");
				System.exit(0);
				return this;
			} else {
				System.out.println("That's not even a direction!");
				return this;
			}
		}
	}

}
