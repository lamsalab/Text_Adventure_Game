 
import java.util.Map;
public class Stairwell extends Space{
 public Stairwell( int turns, Map<String, Items> inventory){
  super("Stairwell",turns,inventory);
  
  items.put("rope", new Rope());
  items.put("flair", new Flair());
  
  System.out.println("You fling yourself from the elevator cutting your feet on the glass as"
    + "you do. As you land hard on the floor the elevator gives way behind you and continues down the"
    + "chute. You make out the enormous thud as it crashes. You wouldn't have survived the fall."
    + "You stop to remove the pieces of glass lodged in your feet. At this point pain is "
    + "irrelevant. You take a look around you and notice something strange about this"
    + "stairwell. It is one of those fancy stair wells with carpeting on the walls and floor"
    + "it must be the stairs that guests use whne they don't want to use the elevator. Despite"
    + "power going out there is a red glow a few feet from you, the only light and it is accompanied"
    + "by a hissing sound. Flairs! There are flairs all over the staircase and one of them"
    + "is going off. You also notice a climbing rope hanging off one the banisters.");}
 
 }
