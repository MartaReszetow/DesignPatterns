package AbstractFactory.Zad2.computerPackage;

public abstract class SamsungPC {

    public static AbstractPC cteateSamsung100() {
        return new AbstractPC("Samsung100", ComputerBrand.SAMSUNG, 30, 60.0, true);
    }

    public static AbstractPC cteateSamsung200() {
        return new AbstractPC("Samsung200", ComputerBrand.SAMSUNG, 80, 60.0, false);
    }

}
