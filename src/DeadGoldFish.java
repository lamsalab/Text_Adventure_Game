
public class DeadGoldFish implements Items {
	private String name;

	public DeadGoldFish() {
		this.name = "dead gold fish ";
	}

	/**
	 * 
	 * @return void
	 */
	public void use() {
		System.out.println("TF are you gonna use this for?!?");
	}

	/**
	 * 
	 * @return a String
	 */
	public String description() {
		return "Yellowish orange looking fish. The name starts with a 'G' and ends with 'fish'. For the dumb ones playing this game, "
				+ "it is a Goldfish which is probably dead by now.";
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
	public void pickup() {
		System.out.println("Good pick! Might come in handy to use.");

	}

	/**
	 * 
	 * @return void
	 */
	public void drop() {
		System.out.println("Congratulations your IQ has increased by 10 points. Now you stand at -15.");

	}
}
