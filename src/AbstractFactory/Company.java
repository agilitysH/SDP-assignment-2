package AbstractFactory;
import Products.Interfaces.*;
public abstract class Company {
    public abstract Burger createBurger();
    public abstract Sandwich createSandwich();
}
