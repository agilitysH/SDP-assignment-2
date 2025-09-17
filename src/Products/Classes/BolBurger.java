package Products.Classes;
import Products.Interfaces.Burger;
public class BolBurger implements Burger {
    private String name;
    public BolBurger() {
    }
    @Override
    public void prepare() {
        name = "Bol Burger";
        System.out.println("Preparing " + name);
    }
}
