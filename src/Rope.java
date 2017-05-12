public class Rope implements Items {
	private String name;
	private boolean used;

	public Rope() {
		this.name = "rope ";
		this.used = false;
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void use() {
		System.out.println("You tie the rope to a casino table and are ready to descend.");
		used = true;
	}

	/**
	 * 
	 * @return a String
	 */
	@Override
	public String description() {
		return "A thick black rope. It looks millitary grade. The guy in the elevator\n"
				+ "must have dropped it or maybe the person who killed him, either way you don't care";
	}

	/**
	 * 
	 * @return a String
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void pickup() {
		System.out.println("Slowly but with great effort you wind the rope tightly around your waist. It will\n"
				+ "probably come in handy later. It smells vaguely like mold and liqor, what on\n"
				+ "earth were the people at the 7th arm using it for?");
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void drop() {
		System.out.println("You let the rope go. You don't need it anymore and of all the items\n"
				+ "you have found so far, it was the most bulky");
	}

	/**
	 * 
	 * @return a Boolean
	 */
	public boolean used() {
		return used;
	}
}