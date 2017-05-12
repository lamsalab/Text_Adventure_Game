
public class FirstAidKit implements Items {
	private boolean used;
	private String name;

	public FirstAidKit() {
		this.name = "first aid kit ";
		this.used = false;
	}

	/**
	 * 
	 * @return void
	 */
	public void use() {
		System.out.println(
				"You have used the first aid kit. Any existing health issues has been resolved. The explosions inside your head have finally calmed down.");
		this.used = true;
	}

	/**
	 * 
	 * @return a String
	 */
	public String description() {
		return "Contains supplies for any medical emergency including bleeding, pain, etc.";
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
				"Every step you take increases your pain by 10 folds. You slowly approach a mark roughly marked by a cross. You struggle to keep your eyes open. "
						+ "But you manage to somehow pick the " + this.getName());

	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void drop() {
		System.out
				.println("You are not worthy of keeping this " + this.getName() + "Hence, the item has been dropped.");

	}

	/**
	 * 
	 * @return a boolean
	 */
	public boolean used() {
		return used;
	}

}
