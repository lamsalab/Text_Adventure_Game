import java.util.Map;

public class Outside extends Space {

	public Outside(Map<String, Items> inventory) {
		super("outside", inventory);

		System.out.println("You land hard on your back as you are flung threw the air by the sudden explosion\n"
				+ ". Your ears are ringing and your left arm goes numb. It goes very dark and very quiet.\n"
				+ "..................Suddenly heat, you think you are burning so you sit up as quick\n"
				+ "as your body will allow ripping a few scabs as you do. Its not heat. It's the sun. You made it outside\n"
				+ "The explosion flung you from the basement door into the green lawn. You ears are ringing but you \n"
				+ "make out the sound of helicopter blades spining through the air. If only there was a way to signal for help");

		if (!inventory.containsKey("flare ")) {
			System.out.println("Unfortunately, you do not have anything to signal for the helicopter.\n"
					+ "You try shouting but the helicopter flies away not noticing you"
					+ "It's too late now. The Soviets just dropped the biggest nuclear bomb. Even before you realize, you've been vaporized.");
			System.exit(0);
		}
	}

	/**
	 * @param direction a String
	 * @return  a Space
	 */
	public Space go(String direction) {
		System.out.println("There is no where to go");
		return this;
	}

	/**
	 * 
	 * @return void
	 */
	public void use(String item) {
		if (item.equals("flare ")) {
			System.out.println("You light up a flare. The helicopter notices you and send down a harness for you.");
			items.put("harness", new Harness());
			items.get("harness").use();
			System.exit(0);
		} else {
			System.out.println("Try using something else");
		}

	}

}
