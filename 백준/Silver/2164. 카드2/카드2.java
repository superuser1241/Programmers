import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bd.readLine());
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=1; i<=n; i++) {
        	queue.add(i);
        }
        
        while (queue.size() > 1) {
            queue.poll();
            int card = queue.poll();
            queue.add(card);
        }
        System.out.println(queue.poll());
    }
}
