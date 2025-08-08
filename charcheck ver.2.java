import org.apache.commons.lang3.StringUtils;

public class App {
    public static String convertString(String text) {
        if (text.equals("")) {
            return ("");
        } else {
            return Character.isUpperCase(text.charAt(0)) ? text : StringUtils.reverse(text);
        }
    }
}