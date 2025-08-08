import org.apache.commons.lang3.StringUtils;

public class App {
    public static boolean isPalyndrome(String str){
        return str.equalsIgnoreCase(StringUtils.reverse(str));
    }
}