import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bd.readLine());
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] command = bd.readLine().split(" ");
            
            switch (command[0]) {
                case "push":
                	stack.push(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
