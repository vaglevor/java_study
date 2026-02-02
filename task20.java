import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task20 {

        public static List<Integer> findAllDivisors1(int n){
            ArrayList<Integer> divs = new ArrayList<>();
            for (int i = 1; i * i <= n; i++) {
                if (n%i == 0) {
                    divs.add(i);
                    if (n/i != i) {
                        divs.add(n/i);
                    }
                }
            }
            return divs;
        }

    public static List<Integer> findAllDivisors2(int n){
        ArrayList<Integer> divs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n%i == 0)
                divs.add(i);
        }
        return divs;
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int sum = 0;
            for (int i : findAllDivisors2(num)) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
