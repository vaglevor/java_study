public class App {
    public static String joinNumbersFromRange(int start, int finish) {
        var i = start;
        var str = "";

        while (i <= finish) {
            str = str + i;
            i++;
        }

        return str;
    }
}
