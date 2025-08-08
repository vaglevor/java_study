import org.apache.commons.lang3.StringUtils;

public class App {
    public static String convertString(String text) {
        if (text.equals("")) {
            return ("");
        } else if (Character.isLowerCase(text.charAt(0))) {
            return StringUtils.reverse(text);
        } else {
            return text;
        }
    }
}
