import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task23 {

        public static List<Integer> findAllDivisors(int n1, int n2){
        ArrayList<Integer> divs = new ArrayList<>();
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1%i == 0 && n2%i == 0)
                divs.add(i);
        }
        return divs;
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1%i == 0 && num2%i == 0)
                    System.out.print(i + " ");
            }
            //System.out.println(findAllDivisors(num1, num2));
        }
    }
