public class Buttons implements Items {
	private String name;
	private boolean used;

	public Buttons() {
		this.name = "buttons ";
		this.used = false;
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void use() {
		System.out.println("You frantically push the elevator buttons. You need to get to the basement\n"
				+ "that's all that matters. You jam down so hard on the large B button that you\n"
				+ "leave some of the blood from your fingers on it. The floor disappears from beneath you.\n"
				+ "Suddenly you come to a grinding halt, smashing your face against the wall\n"
				+ "and busting your lip wide open. Blood gushes from the open wound but you dont have time to\n"
				+ "think about it because you realize the elevator failed, you dont know how far it dropped\n"
				+ "but you know you have to get out fast, the whole thing is quivering and no\n"
				+ "telling how long it will hold before its next tumble with you in it. The door is\n"
				+ "slightly ajar and you can make out a stairwell right outside the doors. You need\n"
				+ "to make for the doors immediately");
		this.used = true;
	}

	/**
	 * 
	 * @return a String
	 */
	@Override
	public String description() {
		return "Elevator buttons, pretty standard you push them and it takes you to the " + "floor you want";

	}

	/**
	 * 
	 * @return a String
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void pickup() {
		System.out.println("Silly child you dont actually pick up the elevator buttons but now you can use \n"
				+ "them to get to the basement quick ;) ps. they are still in your inventory though");

	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void drop() {

		System.out.println("You can't drop elevator buttons but now you cant use them\n"
				+ "point is this isn't a smart idea unless you already used them wink");
	}

	/**
	 * 
	 * @return a boolean
	 */
	public boolean used() {
		return used;
	}
}
