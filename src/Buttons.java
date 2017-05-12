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
		System.out.println("You frantically push the elevator buttons. You need to get to the basement asap!\n"
				+ "Suddenly, the elevator comes to a grinding halt, smashing your face against the wall\n"
				+ "But you dont have time to think about the pain. You dont know how far it dropped but you know you have to get out fast.\n"
				+ "The whole thing is quivering and you're uncertain if the elevators can hold still anymore. You need "
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
