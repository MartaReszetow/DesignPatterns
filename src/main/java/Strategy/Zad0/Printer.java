package Strategy.Zad0;

public class Printer {

    private IFormatterCzcionki formatter = null;

    public void setFormatter(IFormatterCzcionki formatter) {
        this.formatter = formatter;
    }

    public String drukuj(String tekst){
        return formatter.zamienTekst(tekst);
    }
}
