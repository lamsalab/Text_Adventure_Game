import java.util.ArrayList;

public abstract class Space {
private boolean lights;
private Space door;
private Space window;
public ArrayList items;
private String name;

public Space(String name){
	this.name= name;
	items = new ArrayList<>();
}
	public void lookAround(){
		System.out.println("The place is surrounded by various mesmerizing items. Here the items that is in within your range of vision: ");
		for(int i=0; i< items.size(); i++){
			System.out.println(items.get(i));
		}
	}
	
	public void pickUp(){
		
	}
	
	public void Wait(){
		
	}
	
	public void talkTo(){
		
	}
	public void use(){
		
	}
	
	public void attack(){
		
	}
	
	public void go(){
		
	}
	
	public void giveUp(){
		
	}
	public void access(){
		
	}
}
