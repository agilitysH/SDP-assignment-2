package AbstractFactory;
import Products.Classes.BolBurger;
import Products.Classes.BolSandwich;
import Products.Interfaces.*;
public class BolManufacturer extends Company {
    @Override
    public Burger createBurger() {
        return new BolBurger();
    }

    @Override
    public Sandwich createSandwich() {
        return new BolSandwich();
    }
}
