import java.util.Map;
import java.util.Scanner;

public class Parser {
private Scanner in;
private String input;
private String commands;
private String item;
private Space space;
Map<String, Runnable> map;


	public Parser(Scanner in, Space space){
		this.in = in;
		this.space= space;
	}
	public void read(){
		input = in.nextLine().toLowerCase();
		String [] data= input.split(" ");
		commands = data[0];
		item = data[1];
		
		
		switch(commands){
		case "lookaround" :
			space.lookAround();
			break;
		case "pickup":
			space.pickUp(item);
			break;
		case "drop":
			space.drop(item);
			break;
		case "use":
			space.use(item);
			break;
		case "go":
			space.go(item);
			break;
		case "giveup":
			space.giveUp();
			break;
			default:
				throw new IllegalArgumentException();
		}
		
		/*final Commands command = new Commands();
		
		map = new HashMap<>();
		map.put("lookaround", new Runnable()  {
			@Override
			public void run() {
				command.lookAround();
			}
		});
		
		Runnable nextAction = map.get("lookaround");
		nextAction.run();*/
		

		
	}
}
