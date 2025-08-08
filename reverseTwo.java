public class App {
    public static String encrypt(String str) {
        var result = "";
        for (int i = 0; i < str.length() - 1; i += 2) {
            result = result + str.charAt(i + 1) + str.charAt(i);
        }
        if (str.length() % 2 != 0){
                result = result + str.charAt(str.length() - 1);
            }
        return result;
    }
}