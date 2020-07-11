package AbstractFactory.Zad2.computerPackage;

public abstract class ApplePC {


    public static AbstractPC cteateApple100() {
        return new AbstractPC("Apple100", ComputerBrand.APPLE, 90, 90.0, false);
    }

     public static AbstractPC cteateApple200() {
        return new AbstractPC("Apple200", ComputerBrand.APPLE, 100, 100.0, false);
    }


}
