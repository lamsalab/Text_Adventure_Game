
public class SwissArmyKnife implements Items {

	private boolean used;
	private String name;

	public SwissArmyKnife() {
		this.name = "swiss army knife ";
		this.used = false;
	}

	/**
	 * 
	 * @return void
	 */
	public void use() {
		System.out.println(
				"You are completely baffled by the existence of such multi-purpose tool given your low IQ.\n"
						+ "But, you are determined to get out of this place before the Soviets turn the city into ashes. You\n"
						+ "struggle to find the right tool to open the door. You try to crank it open with a toothpick. But it doesn't work. \n"
						+ "Then you try a bunch of other tools but none of them work. Finally, you see the knife and use it to open the elevator");
		this.used = true;

	}

	/**
	 * 
	 * @return a String
	 */
	public String description() {
		return "It is a multipurpose tool that can perform a range of tasks from filing metal to cutting wood.";
	}

	/**
	 * 
	 * @return a String
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void pickup() {
		System.out.println(
				"After watching too much of Man vs Wild, you believe that this item may help you in your survival. \n"
						+ "(Disclamer: The man vs Wild guy doesn't use a swiss army knife)");

	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void drop() {
		System.out.println("Ha! Good luck escaping.");

	}

	/**
	 * 
	 * @return a Boolean
	 */
	public boolean used() {
		return used;
	}

}
