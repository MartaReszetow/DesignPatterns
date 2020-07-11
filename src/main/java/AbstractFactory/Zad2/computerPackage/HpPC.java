package AbstractFactory.Zad2.computerPackage;

public abstract class HpPC {


    public static AbstractPC cteateHP100() {
        return new AbstractPC("HP100", ComputerBrand.HP, 50, 50.0, true);
    }

    public static AbstractPC cteateHP200() {
        return new AbstractPC("HP200", ComputerBrand.HP, 70, 99.0, false);
    }


}
