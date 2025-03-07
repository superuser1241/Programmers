import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        int st3 = sc.nextInt();
        
        System.out.println(Integer.parseInt(st1)+Integer.parseInt(st2)-st3);
        System.out.println(Integer.parseInt(st1+st2)-st3);
    }
}