public class App {
    public static boolean hasChar(String str, char ch) {
        var i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }
            i++;
        }
        return false;
    }
}
