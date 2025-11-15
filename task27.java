import java.util.Scanner;

public class task27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0){
            System.out.println("ERROR");
        } else {
            for (int i = 0; i < a; i++){
                for (int j = 0; j < b; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
