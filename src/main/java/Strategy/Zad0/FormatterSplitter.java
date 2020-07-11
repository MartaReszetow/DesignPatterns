package Strategy.Zad0;

public class FormatterSplitter implements IFormatterCzcionki {


    @Override
    public String zamienTekst(String tekstDoZmiany) {

        char[] chars = tekstDoZmiany.toCharArray();
        String separatedString = null;
        for (char singeChar : chars) {
            separatedString = separatedString + singeChar + ' ';
        }
        return separatedString;
    }
}
