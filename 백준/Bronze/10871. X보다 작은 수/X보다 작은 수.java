import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++) {
        	int num =sc.nextInt();
        	if(num<x) {
        		sb.append(num).append(" ");
        	}
        }
        
        System.out.println(sb);
    }
}
