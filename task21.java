import java.util.Scanner;

public class task21 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int main_num = sc.nextInt();
            int divs = 0;
            int num;
            do {
                num = sc.nextInt();
                if (main_num % num == 0 && num >= 0) {
                    divs++;
                }
            } while (num >= 0);
            System.out.println(divs);
        }
    }
