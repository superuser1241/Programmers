import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int n = sc.nextInt();
        int[] sequence = new int[n];
        
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        
        int num = 1; 
        for (int i = 0; i < n; i++) {
            int target = sequence[i];
            
            while (num <= target) {
                stack.push(num++);
                sb.append("+\n");
            }

            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println(sb);
    }
}
