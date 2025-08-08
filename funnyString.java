public class App {
    public static String makeItFunny(String str, int n) {
        var i = 0;
        var result = "";

        while (i < str.length()) {
            var currentChar = str.charAt(i);
             if ((i + 1) % n == 0) {
                result += Character.toUpperCase(currentChar);
             } else {
                result += currentChar;
             }
             i++;
        }

        return result;
    }
}