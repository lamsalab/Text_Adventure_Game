
public class SwissArmyKnife implements Items{

	boolean used = false;
	
	public void use() {
		System.out.println("You have never used a SwissArmy Knife before. You are completely baffled by the existence of such multi-purpose tool \n"
				+ "given your low IQ. But, you are determined to get out of this place before the Soviets turn the city into ashes. You \n"
				+ "struggle to find the right tool to open the door. You try to crank it open with a toothpick. But it doesn't work. \n"
				+ "Then you try a bunch of other tools but none of them work. Finally, you see the knife and use it to open the elevator");
		used = true;
		
	}

	public String description() {
		return "It is a multipurpose tool that can perform a range of tasks from filing metal to cutting wood.";		
	}

	public String getName() {
		return "swiss army knife ";
	}

	@Override
	public void pickup() {
		System.out.println("After watching too much of Man vs Wild, you believe that this item may help you in your survival. \n"
				+ "(Disclamer: The man vs Wild guy doesn't use a swiss army knife)");
		
	}

	@Override
	public void drop() {
		System.out.println("Ha! Good luck escaping.");
		
	}
	public boolean used(){
		return used;
	}

}
