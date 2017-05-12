
public class Harness implements Items{

	public Harness(){
		
	}
	@Override
	public void use() {
		System.out.println("You cannot believe that this is happening. You swing the harness around your shoulders\n"
				+ "with all the blood on your fingers it's difficult to fit the clasp on. With what little \n"
				+ "strength you have left, you somehow manage to get it on. The soldiers,or at least you think they\n"
				+ "are soldiers lift you up into the helicopter. You barely hear one of say \"you made it\" before \n"
				+ "you let yourself the darkness of the exhaustion envelope you and you fall asleep. You made it.\n");
		
	}

	@Override
	public String description() {
		return "A sort of yellow-brown harness dropped by the helicopter hovering above you.\n"
				+ "this could be your only way out";
		
	}

	@Override
	public void pickup() {
		System.out.println("Each step causing you to shudder in pain, you stumble forward and pickup the"+
	this.getName());
		
	}

	@Override
	public void drop() {
		System.out.println("You look at the hold thing and decide it can't hold your weight"
				+ "the thing looks like it has seen better days. You drop"+this.getName());
		
	}
	@Override
	public String getName() {
		return "harness ";
	}

}
