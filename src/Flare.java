public class Flare implements Items {
private boolean used = false;	
private  String name;
 
 public Flare(){
  this.name="flare ";
 }
 
 
 @Override
 public void use() {
  System.out.println("You light up a flare");
  used = true;
 }
 @Override
 public String description() {
  return"Several black flares laying around in the hallway \n";
 }
 @Override
 public String getName() {
  return this.name;
 }
 @Override
 public void pickup() {
  System.out.println("They are scattered everywhere.Bracing yourself on the wall you manage to \n"
    + "move around the current flight and pick up as many flares as you can. The pain\n"
    + "from the glass in the elevator make each step almost unbearbale but you keep "
    + "moving");
 }
 @Override
 public void drop() {
  System.out.println("If it were one or two, you would hold on to them but at this point you don't\n"
    + "think you need them. You reckon you can see well enough without them anyway");
 }
 
 public boolean used(){
	 return used;
 }
}