import java.util.Locale;
import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double grade, k = 0, sum = 0;
        double sred;
        grade = scan.nextInt();
        while (grade >= 0) {
            sum += grade;
            k++;
            grade = scan.nextInt();
        }
        if (k > 0) {
            sred = sum / k;
            System.out.printf("%.1f", sred);
        } else {
            System.out.println("No data");
        }
    }
}
