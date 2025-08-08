import java.time.LocalDate;

public class App {
    public static boolean notToday(String date){
        return !(LocalDate.now().toString().equalsIgnoreCase(date));
    }
}