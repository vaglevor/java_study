public class App {
    public static boolean isInternationalPhone(String str){
        var firstChar = str.substring(0, 1);
        return firstChar.equalsIgnoreCase("+");
    }

}

