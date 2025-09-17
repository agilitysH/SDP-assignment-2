package AbstractFactory;
import Products.Interfaces.*;
import Products.Classes.RomanovBurger;
import Products.Classes.RomanovSandwich;
public class RomanovManufacturer extends Company {
    @Override
    public Burger createBurger() {
        return new RomanovBurger();
    }
    @Override
    public Sandwich createSandwich() {
        return new RomanovSandwich();
    }
}
