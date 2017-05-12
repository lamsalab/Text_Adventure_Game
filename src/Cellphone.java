public class Cellphone implements Items {
	private String name;

	public Cellphone() {
		this.name = "cellphone ";
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void use() {
		System.out.println("You tap the power button with your right hand and cross the fingers on your left\n"
				+ "the phone turns on. Ecstatic you wait for it to completely boot up. It's \n"
				+ "an iPhone, you aalways hated them but right now it almost seems like a good phone.\n"
				+ "till you see there is no signal. Typical apple phone looks beautiful but no " + "functionality");
	}

	/**
	 * 
	 * @return a String
	 */
	@Override
	public String description() {
		return "A white touchscreen phone you saw lying next to the body of a middle aged\n"
				+ "man who well.....lets just say he didn't make it. It seems in good shape" + "perhaps even usable";
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
		System.out.println("You're going to have to touch the corspe to do this one. You carefully \n"
				+ "unwrap the cellphone from bettwen the dead man's fingers. The body has only began to\n"
				+ "decompose so the smell is bearable but still enough to make your eyes water.");
	}

	/**
	 * 
	 * @return void
	 */
	@Override
	public void drop() {
		System.out.println("You drop the piece of garbage phone. It didn't look it would help you"
				+ "and it was slowing you down");
	}
}