package AbstractFactory.Zad2.computerPackage;

import lombok.Data;

@Data
public class AbstractPC {

    String pcName;
    ComputerBrand comuterBrand;
    int cpuPower;
    double gpuPower;
    boolean isOverlocked;

    public AbstractPC(String pcName, ComputerBrand comuterBrand, int cpuPower, double gpuPower, boolean isOverlocked) {
        this.pcName = pcName;
        this.comuterBrand = comuterBrand;
        this.cpuPower = cpuPower;
        this.gpuPower = gpuPower;
        this.isOverlocked = isOverlocked;
    }
}
