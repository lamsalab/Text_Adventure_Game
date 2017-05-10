import java.util.Scanner;

public class Parser {
private Scanner in;
private String command;
	public Parser(Scanner in){
		in = new Scanner(System.in);
	}
	public void read(){
		command= in.nextLine();
	}
}
