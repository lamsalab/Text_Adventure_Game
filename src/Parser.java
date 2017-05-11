
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parser {
private Scanner in;
private String input;
private String commands;
private String item;
Map<String, Runnable> map;


	public Parser(Scanner in){
		this.in = in;
	}
	public void read(){
		input = in.nextLine().toLowerCase();
		String [] data= input.split(" ");
		commands = data[0];
		item = data[1];
		
		Commands state = new Commands();
		switch(commands){
		case "lookaround" :
			state.lookAround();
			break;
		case "pickup":
			state.pickUp(item);
			break;
		case "drop":
			state.drop(item);
			break;
		case "use":
			state.use(item);
			break;
		case "go":
			state.go();
			break;
		case "giveup":
			state.giveUp();
			break;
			default:
				throw new IllegalArgumentException();
		}
		
		final Commands command = new Commands();
		
		map = new HashMap<>();
		map.put("lookaround", new Runnable()  {
			@Override
			public void run() {
				command.lookAround();
			}
		});
		
		Runnable nextAction = map.get("lookaround");
		nextAction.run();
		

		
	}
}
