
public class FirstAidKit implements Items {
	public void use() {
		System.out.println("You have used the first aid kit. Any existing health issues has been resolved. The explosions inside your head have fiannly calmed down.");
	}

	public void description() {
		System.out.println("Contains supplies for any medical emergency including bleeding, pain, etc.");
	}

	public String getName() {
		return "FirstAidKit";
	}

	@Override
	public void pickup() {
		System.out.println("Every step you take increases your pain by 10 folds. You slowly approach a mark roughly marked by a cross. You struggle to keep your open. "
				+ "But you manage to somehow pick the" + this.getName());
		
	}

	@Override
	public void drop() {
		System.out.println("You are not worthy of keeping this" + this.getName() + "Hence, the item has been dropped.");
		
	}

}
