public class App {
    public static String filterString(String str, char ch) {
        var i = 0;
        var result = str;

        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                result = str.replaceAll(str.substring(str.indexOf(ch), (str.indexOf(ch) + 1)), "");
            } 
            
            i++;
        }

        return result;
    }
}

public class App {
    public static String filterString(String str, char ch) {
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var currentChar = str.charAt(i);
            if (currentChar != ch) {
                result += currentChar;
            }
            i += 1;
        }

        return result;
    }
}

public class App {
    public static String filterString(String str, char ch) {
        // BEGIN (write your solution here)
        StringBuilder filtered = new StringBuilder();

        
        for (int i = 0; i < str.length(); i++) {
          
            if (str.charAt(i) != ch) {
                filtered.append(str.charAt(i));
            }
        }
       
        return filtered.toString();
    }
        // END
    }

    public class App {
    public static String makeItFunny(String str, int n) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "";

        while (i < str.length()) {
            var currentChar = str.charAt(i);
             if ((str.indexOf(currentChar) + 1) % n == 0) {
                result += Character.toUpperCase(currentChar);
             } else {
                result += currentChar;
             }
             i++;
        }

        return result;
        // END
    }
}