import java.util.Map;

public class Commands {
	public Map<String,Items> items;
	public Map<String,Items> inventory;
	private int turns;
	
	public void lookAround(){
		System.out.println("The place is surrounded by various mesmerizing items. Here the items that is in within your range of vision: ");
		for(int i=0; i< items.size(); i++){
			items.get(i).description();
		}
	}
	
	public Void pickUp(String item){
		item=item.toLowerCase();
		if(items.containsKey(item)){
		System.out.println("You picked up "+ items.get(item));
		Items picked=items.get("item");
		inventory.put(picked.getName(), picked);
		turns++;}
		else{
			System.out.println("You must be hallucinating because you realize this item isnt in the room");
		}
		return null;
		
	}
	
	public Void drop(String item){
		item = item.toLowerCase();
		if(inventory.containsKey(item)){
		System.out.println("You dropped " + items.get(item));
		inventory.remove(item);
		turns++;
		}
		else{
			System.out.println("You can't quite drop something you don't have now can you?");
		}
		return null;
	}
	
	/*public void Wait(){
		System.out.println("Exhausted you let yourself sink to the floor to think things through. As horrifying as this day has been you realize that you are ok"+
	"here in the"+ this.name +"you let yourself fade into a half sleep");
		System.out.println("You wake up with a jolt");
		this.turns++;
		
	}*/
	

	public Void use(String item){
		Items usable = items.get(item);
		usable.use();
		return null;
	}
	
	
	public Void go(){
		return null;
	}
	
	public Void giveUp(){
		System.out.println("It's all too much for you. Why keep on going.You fling yourself out ");
		return null;
	}
}