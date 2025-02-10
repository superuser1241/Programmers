import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        System.out.println(method(n,k));
    }
    
    public static int method(int n, int k){
        return factorial(n) / (factorial(k) * factorial(n-k));
    }
    
    public static int factorial(int num){
        if(num ==0 || num==1)return 1;
        return num * factorial(num - 1);
    }
}