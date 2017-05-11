public class ID implements Items {
	String name = "ID";

	@Override
	public void use() {
		System.out.println("The photo on the ID is smudged but you can make out the face of a middle aged"
				+ "caucasian male. The name reads Colonel Timoty Barnes of the 7th Arm. 7th"
				+ "Arm, you vaguely remember the name of the special division of the CIA in charge"
				+ "of Russian nuclear intelligence");
	}

	@Override
	public void description() {
		System.out.println("A blood stained ID lying next to the corpse of the male of the elevator in the corner."
				+ "it could provide some useful information about who he is and why is there");

	}

	@Override
	public String getName() {
		return "ID";
	}

	@Override
	public void pickup() {
		System.out.println("Careful not to touch the corpse, you reach out with your left arm,"
				+ "right arm holding on to the railing in the elevator and pick up the " + this.getName());

	}

	@Override
	public void drop() {
		System.out.println("You drop the ID, it gives you the creeps, you don't know why the &th Arm is"
				+ "here but you want nothing to do with it");

	}
}