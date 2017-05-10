import java.util.Map;

public class Outside extends Space{

	public Outside(String name, int turns, Map<String, Items> inventory) {
		super(name, turns, inventory);
		items.put("harness", new harness());
		System.out.println("You land hard on your back as you are flung threw the air by a sudden explosion"
				+ ". Your ears are ringing and your left arm goes numb. It goes very dark and very quiet."
				+ "..................Suddenly heat, you think you are bruning so you sit up as quick"
				+ "as your body will allow ripping a few scabs as you do. Its not heat. It's the sun. You made it outside"
				+ "The explosion flung you from the basement door into the green lawn. You ears are ringing but you m"
				+ "ake out the sound of helicopter blades spining through the air. In disbelief you look up to see"
				+ "a millitary helicopter dropping a harness for you");
	}

}
