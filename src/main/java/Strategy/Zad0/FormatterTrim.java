package Strategy.Zad0;

public class FormatterTrim implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <tekstDoZmiany.length() ; i++) {

                builder.append(tekstDoZmiany.charAt(i)).append(' ');}


        return builder.toString();
    }
    }

