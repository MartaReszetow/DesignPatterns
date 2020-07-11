package Strategy.Zad0;

import javax.xml.crypto.Data;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String komenda;
        Printer drukarka = new Printer();

        do {
            komenda = scanner.nextLine();

            if (komenda.startsWith("zmien")) {        // zmien inverter
                obslugaZmianyFormattera(drukarka, komenda.split(" ")[1]);
            }else if(komenda.startsWith("formatuj")){
                obslugaWypisu(drukarka, komenda.split(" ", 2)[1]);
            }

        } while (!komenda.equalsIgnoreCase("quit"));
    }

    private static void obslugaWypisu(Printer drukarka, String tekstDoDruku) {
        System.out.println(drukarka.drukuj(tekstDoDruku));;
    }

    private static void obslugaZmianyFormattera(Printer drukarka, String type){
        if (type.equalsIgnoreCase("inverter")) {
            drukarka.setFormatter(new FormatterInverter());
        }else if (type.equalsIgnoreCase("upper")){
            drukarka.setFormatter(new FormatterUpper());
        }
        else if (type.equalsIgnoreCase("trim")){
            drukarka.setFormatter(new FormatterSplitter());
        }
        }
    }

