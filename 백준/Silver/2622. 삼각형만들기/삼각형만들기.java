import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        
        for (int a = 1; a <= n / 3; a++) {
            for (int b = a; b <= (n - a) / 2; b++) {
                int c = n - a - b;
                if (a + b > c && b + c > a && c + a > b) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
