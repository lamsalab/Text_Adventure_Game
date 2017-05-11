import java.util.Map;

public class CasinoFloor extends Space{

    public CasinoFloor (Map<String, Items> inventory){
        super("CasinoFloor", 0, inventory);
        Items vodka = new Vodka();
        items.put("vodka", vodka);
        System.out.println("As you enter the casino floor you notice a gaping hole in the center of the floor."
                + " You approach the hole and see the basement directly beneath you."
                + " Now would be a good time to have a rope.");
        if(vodka.used()){
            System.out.println("The vodka starts to kick in as you lean over the hole."
                    +" You loose your balance and fall to the basement."
                    +" You land on our head as your neck snaps."
                    +" That is the last sound you hear");
           }
        if(inventory.get("rope").used()){
            
        }
        }
}
