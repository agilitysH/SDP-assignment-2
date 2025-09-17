package Products.Classes;
import Products.Interfaces.Sandwich;
public class BolSandwich implements Sandwich {
    private String name;
    public BolSandwich() {
}
    @Override
    public void prepare() {
        name = "Bol Sandwich";
        System.out.println("Preparing " + name);
    }
}
