
public class DeadGoldFish implements Items {
	public DeadGoldFish() {
	}

	public void use() {
		System.out.println("TF are you do with this you piece of shit?");
	}

	public String description() {
		return
				"Yellowish orange looking fish. The name starts with a 'G' and ends with 'fish'. For the dumb ones playing this game, "
						+ "it is a Goldfish which is probably dead by now.";
	}

	public String getName() {
		return "GoldFish";
	}

	public void pickup() {
		System.out.println("Good pick! Might come in handy to use.");

	}

	public void drop() {
		System.out.println("Congratulations your IQ has increased by 10 points. Now you stand at -15.");

	}
}
