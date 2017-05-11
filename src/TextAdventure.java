import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAdventure {
private static HashMap<String, Items> inventory;
private static int count;
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		inventory= new HashMap<>();
		System.out.println("Welcome to the newly featured game called 'America under Trump'");
		Space space = new Penthouse(inventory);
		while(count < 10){
			Parser parser = new Parser(in, space);
			space = parser.read();
			count++;
		}
		System.out.println("It's too late now. The Soviets just dropped the biggest nuclear bomb. Even before you realize, you've been vaporized.");
		in.close();
	}
}
