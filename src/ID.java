public class ID implements Items {
	private String name;

	public ID() {
		this.name = "id ";
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void use() {
		System.out.println("The photo on the ID is smudged but you can make out the face of a middle aged\n"
				+ "caucasian male. The name reads Colonel Timoty Barnes of the 7th Arm. 7th\n"
				+ "Arm, you vaguely remember the name of the special division of the CIA in charge\n"
				+ "of Russian nuclear intelligence");
	}

	/**
	 * 
	 * @return a String
	 */
	@Override
	public String description() {
		return "A blood stained ID lying next to the corpse of the male of the elevator in the corner.\n"
				+ "it could provide some useful information about who he is and why is he there";

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
		System.out.println("Careful not to touch the corpse, you reach out with your left arm,\n"
				+ "right arm holding on to the railing in the elevator and pick up the " + this.getName());

	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void drop() {
		System.out.println("You drop the ID, it gives you the creeps, you don't know why the 7th Arm is\n"
				+ "here but you want nothing to do with it");

	}
}