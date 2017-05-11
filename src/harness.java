
public class harness implements Items{

	public harness(){
		
	}
	@Override
	public void use() {
		System.out.println("You cannot believe that this is happening. You swing the harness around your shoulders"
				+ "with all the blood on your fingers it's difficult to fit the clasp on. With what little "
				+ "strength you have left, you somehow manage to get it on. The soldiers,or at least you think they"
				+ "are soldiers lift you up into the helicopter. You barely hear one of say \"you made it\" before"
				+ "you let yourself the darkness of the exhaustion envelope you and you fall asleep. You made it.");
		
	}

	@Override
	public String description() {
		return "A sort of yellow-brown harness dropped by the helicopter hovering above you."
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
		return this.getName();
	}

}
