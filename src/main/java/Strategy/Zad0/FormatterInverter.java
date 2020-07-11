package Strategy.Zad0;

public class FormatterInverter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {

    StringBuilder builder = new StringBuilder();
        for (int i = 0; i <tekstDoZmiany.length() ; i++) {
            if(Character.isLowerCase(tekstDoZmiany.charAt(i))){
                builder.append(Character.toUpperCase(tekstDoZmiany.charAt(i)));}
            else if (Character.isUpperCase(tekstDoZmiany.charAt(i))){
                builder.append(Character.toLowerCase(tekstDoZmiany.charAt(i)));
            }
                else {builder.append(tekstDoZmiany.charAt(i));}
            }
       return builder.toString();
    }
}
