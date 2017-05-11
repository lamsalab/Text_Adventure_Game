public class Flair implements Items {
 String name;
 
 public Flair(){
  this.name="flair";
 }
 
 
 @Override
 public void use() {
  System.out.println("You light up a flair and the room is brighter than before. You notice things"
    + "you didn't before. Maybe your mind is playing tricks on you but you think you "
    + "can make out words on the wall");
 }
 @Override
 public String description() {
  return"Several black flairs laying around in the hallway ";
 }
 @Override
 public String getName() {
  return this.name;
 }
 @Override
 public void pickup() {
  System.out.println("They are scattered everywhere.Bracing yourself on the wall you manage to "
    + "move around the current flight and pick up as many flair as you can. The pain"
    + "from the glass in the elevator make each step almost unbearbale but you keep"
    + "moving");
 }
 @Override
 public void drop() {
  System.out.println("If it were one or two, you would hold on to them but at this point you don't"
    + "think you need them. You reckon you can see well enough without them anyway");
 }
}