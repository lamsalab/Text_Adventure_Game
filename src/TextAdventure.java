import java.util.HashMap;
import java.util.Scanner;

public class TextAdventure {
private static HashMap<String, Items> inventory;
private static int count;
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		inventory= new HashMap<>();
		System.out.println("Welcome to the newly featured game called 'America under Trump'");
		System.out.println("You wake up in a Penthouse of a skyscraper in NY. The Soviets have attacked the US over Trump-Putin memes. \n"
				+ "The aim of the game is to escape the building before the Soviets drop a nuclear bomb. Be careful, you have limted turns."
				+ "Use your commands wisely!\n"
				+ "Tip: use help command to get a list of possible commands");
		Space space = new Penthouse(inventory);
		while(count < 60){
			System.out.println("Turn: " + count);
			Parser parser = new Parser(in, space);
			space = parser.read();
			count++;
		}
		System.out.println("It's too late now. The Soviets just dropped the biggest nuclear bomb. Even before you realize it, you've been vaporized.");
		in.close();
	}
}
