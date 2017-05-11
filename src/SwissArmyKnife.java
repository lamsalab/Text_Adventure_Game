
public class SwissArmyKnife implements Items{

	
	public void use() {
		System.out.println("You have never used a SwissArmy Knife before. You are completely baffled by the existence of such multi-purpose tool "
				+ "given your low IQ. But, you are determined to get out of this place before the Soviets turn the city into ashes. You "
				+ "struggle to find the right tool to open the door. You try to crank it open with a plain knife. But it doesn't work. "
				+ "Then you try a bunch of other tools but none of them work. Finally, you see the ");
		
	}

	public void description() {
		System.out.println("It is a multipurpose tool that can perform a range of tasks from filing metal to cutting wood.");		
	}

	public String getName() {
		return "SwissArmyKnife";
	}

	@Override
	public void pickup() {
		System.out.println("After watching too much of Man vs Wild, you believe that this item may help you in your survival. "
				+ "(Disclamer: The man vs Wild guy doesn't use a swiss army knife)");
		
	}

	@Override
	public void drop() {
		System.out.println("Ha! Good luck escaping.");
		
	}

}
