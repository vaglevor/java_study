import java.util.Scanner;

public class task24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char sym = sc.next().charAt(0);
        if (num1 != 1 && num1 != 2 || num2 < 0 ) {
            System.out.println("ERROR");
        } else if (num1 == 1) {
            for (int i = 1; i <= num2; i++)
                System.out.println(sym);
        } else {
            for (int i = 1; i <= num2; i++)
                System.out.print(sym);
        }
    }
}
