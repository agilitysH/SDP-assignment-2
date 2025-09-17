package Products.Classes;
import Products.Interfaces.Sandwich;
public class RomanovSandwich implements Sandwich {
    private String name;
    public RomanovSandwich() {
    }
    @Override
    public void prepare() {
        name = "Romanov Sandwich";
        System.out.println("Preparing " + name);
    }
}
