import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(s.substring(n - 5));
    }
}