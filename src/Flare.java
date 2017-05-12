public class Flare implements Items {
	private boolean used;
	private String name;

	public Flare() {
		this.name = "flare ";
		this.used = false;
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void use() {
		System.out.println("You light up a flare");
		this.used = true;
	}

	/**
	 * 
	 * @return a String
	 */
	@Override
	public String description() {
		return "Several black flares laying around in the hallway \n";
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
		System.out.println("They are scattered everywhere but you manage to pick up as many flares as you can. The pain\n"
			    + "in your foot from the glass in the elevator makes each step almost unbearbale but you keep moving.");
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void drop() {
		System.out.println("If it were one or two, you would hold on to them but at this point you don't\n"
				+ "think you need them. You reckon you can see well enough without them anyway");
	}

	/**
	 * 
	 * @return a boolean
	 */
	public boolean used() {
		return used;
	}
}