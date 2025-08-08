import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int max = s1;
        int min = s1;
        int max = (s1 > s2) ? ((s1 > s3) ? s1 : s3) : (s2 > s3) ? s2 : s3;
        int min = (s1 < s2) ? ((s1 < s3) ? s1 : s3) : (s2 < s3) ? s2 : s3;
        System.out.println(max - min);
    }
}