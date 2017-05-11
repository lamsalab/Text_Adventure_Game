public class Buttons implements Items {
String name;
 public Buttons(){
  this.name="buttons";
 }
 @Override
 public void use() {
  System.out.println("You hurrieldy push the elevator buttons. You need to get to the basement"
    + "that's all that matters. You jam down so hard on the large B button that you "
    + "leave some of the blood on your fingers on it. The floor disappears from beneath you"
    + ".Suddenly you come to a grinding halt, smashing your face against the wall "
    + "and busting your lip wide open Blood gushes from the open wound but you dont have time to"
    + "think about it because you realize the elevator failed, you dont knoe how far it dropped"
    + "but you know you have to get out fast, the whole thing is quivering and no "
    + "telling how long it will hold before its next tumble with you in it. The door is "
    + "slightly ajar and you can make out a stairwell right outside the doors. You need "
    + "to make for the doors immediately");
 }
 @Override
 public void description() {
  System.out.println("Elevator buttons, pretty standard you push them and it takes you to the"
    + "floor you want");
  
 }
 @Override
 public String getName() {
  // TODO Auto-generated method stub
  return null;
 }
 @Override
 public void pickup() {
  System.out.print("Silly child you dont actually pick up the elevator buttons but now you can use "
    + "them to get to the basement quick ;) ps. they are still in your inventory though");
  
 }
 @Override
 public void drop() {
  
  System.out.println("Well again you can't drop elevator buttons but now you cant use them"
    + "point is this isn't a smart idea unless you already used them wink");
 }
}

