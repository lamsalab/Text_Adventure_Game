import java.util.HashMap;

public class Penthouse extends Space{
public Penthouse(HashMap<String,Items> inventory){
	super("Penthouse",0, inventory);
	items.put("flashlight",new FlashLight());
	items.put("deadgoldfish", new DeadGoldFish());
	items.put("swissArmyKnife", new SwissArmyKnife());
}
	
}
