package Products.Classes;
import Products.Interfaces.Burger;

public class RomanovBurger implements Burger {
    private String name;
    public RomanovBurger() {
    }
    @Override
    public void prepare() {
        name = "Romanov Burger";
        System.out.println("Preparing " + name);
    }
}
