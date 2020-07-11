package AbstractFactory.Zad2;

import AbstractFactory.Zad2.computerPackage.AbstractPC;
import AbstractFactory.Zad2.computerPackage.ApplePC;
import AbstractFactory.Zad2.computerPackage.HpPC;
import AbstractFactory.Zad2.computerPackage.SamsungPC;

public class Main {

    public static void main(String[] args) {

        AbstractPC newSamsung100 = SamsungPC.cteateSamsung100();
        AbstractPC newSamsung200 = SamsungPC.cteateSamsung100();
        AbstractPC newApple100 = ApplePC.cteateApple100();
        AbstractPC newHP100 = HpPC.cteateHP100();

    }
}

