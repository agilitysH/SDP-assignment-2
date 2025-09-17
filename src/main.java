import AbstractFactory.*;
import Products.Interfaces.*;
public class main {
    public static void main(String[] args) throws Exception {
        Company bol = new BolManufacturer();
        Burger bolBurger = bol.createBurger();
        bolBurger.prepare();

        Sandwich bolSandwich = bol.createSandwich();
        bolSandwich.prepare();

        Company romanov = new RomanovManufacturer();
        Burger romanovBurger = romanov.createBurger();
        romanovBurger.prepare();

        Sandwich romanovSandwich = romanov.createSandwich();
        romanovSandwich.prepare();
    }
}
