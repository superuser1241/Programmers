import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            
            System.out.print(num);
            
            while (num >= 10) { 
                int product = 1;
                int temp = num;
                
                while (temp > 0) {
                    product *= temp % 10;
                    temp /= 10;
                }
                
                System.out.print(" " + product);
                num = product;
            }
            
            System.out.println();
        }
    }
}