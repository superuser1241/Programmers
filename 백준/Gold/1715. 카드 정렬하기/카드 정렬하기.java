import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=0; i<n; i++) {
        	int m = sc.nextInt();
        	queue.add(m);
        }
        int m1=0;
        int m2=0;
        int sum=0;
        while(queue.size() !=1) {
        	m1 = queue.remove();
        	m2 = queue.remove();
        	sum += m1 + m2;
        	queue.add(m1 + m2);
        }
        System.out.println(sum);
    }
}