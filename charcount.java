public class App {
    public static int countChars(String str, char ch) {
        var i = 0;
        var count = 0;

        while (i < str.length()) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
                count++;
            }

            i++;

        }

        return count;
    }
}