import java.util.Scanner;

public class task22 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int sum = 0;
            int dig;
            if (num < 0) {
                num = -num;
            }
            int digs_num = String.valueOf(num).length();
            do {
                dig = num % 10;
                sum += dig;
                num /= 10;
            } while (dig != 0);
            System.out.println(digs_num + " " + sum);
        }
    }
