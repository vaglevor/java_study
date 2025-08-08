public class App {
    public static void printReversedNameBySymbol(String name) {
        var i = name.length() - 1;

        while (i >= 0) {
            System.out.println(name.charAt(i));
            i--;
        }
    }
}