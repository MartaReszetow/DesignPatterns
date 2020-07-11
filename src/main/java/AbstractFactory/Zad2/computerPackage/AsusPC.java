package AbstractFactory.Zad2.computerPackage;

public abstract class AsusPC{

    public static AbstractPC cteateAsusPC100() {
        return new AbstractPC("Asus100", ComputerBrand.ASUS, 50, 50.0, false);
    }
    public static AbstractPC cteateAsusPC200() {
        return new AbstractPC("Asus200", ComputerBrand.ASUS, 70, 70.0, false);
    }



}
