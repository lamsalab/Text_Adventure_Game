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
	public static int countWords(String s){

	    int wordCount = 0;

	    boolean word = false;
	    int endOfLine = s.length() - 1;

	    for (int i = 0; i < s.length(); i++) {
	        // if the char is a letter, word = true.
	        if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
	            word = true;
	            // if char isn't a letter and there have been letters before,
	            // counter goes up.
	        } else if (!Character.isLetter(s.charAt(i)) && word) {
	            wordCount++;
	            word = false;
	            // last word of String; if it doesn't end with a non letter, it
	            // wouldn't count without this.
	        } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
	            wordCount++;
	        }
	    }
	    return wordCount;
	}
	public Space read(){
		input = in.nextLine().toLowerCase();
		int number = countWords(input);
		
		if(number > 1){
		String [] data= input.split(" ");
		commands = data[0];
		item = data[1];
		}
		else {
			commands = input;
		}
		
		
		switch(commands){
		case "lookaround" :
			space.lookAround();
			return null;
		case "pickup":
			space.pickUp(item);
			return null;
		case "drop":
			space.drop(item);
			return null;
		case "use":
			space.use(item);
			return null;
		case "go":
			return space.go(item);
		case "giveup":
			space.giveUp();
			return null;
		case "wait":
			space.Wait();
			return null;
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
