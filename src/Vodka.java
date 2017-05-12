
public class Vodka implements Items{
    private boolean used = false;
    public void use() {
        System.out.println("All this trying to save yourself is getting too much for you. \n"
                + "You need to sit down and have a drink before you go insane. \n"
                + "You chug down half the bottle numbing any pain you felt.");
        used = true;
    }

    public String description() {
        return "The fanciest bottle of vodka you have seen. It is labelled 'Yamskaya Russian Vodka'";
    }

    public String getName() {
        return "Vodka ";
    }

    @Override
    public void pickup() {
        System.out.println("Even in this situation you are not going to miss out on a free drink."
                + "You pick up the" + this.getName());
        
    }

    @Override
    public void drop() {
        System.out.println("You decide now is probably not a good time for a drink and drop the bottle of " + this.getName() + ". Smart move!");   
    }

    public boolean used() {
        return used;
    }

}
