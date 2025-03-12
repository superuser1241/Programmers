import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<=n; i++) {
        	arr.add(new ArrayList<Integer>());
        }
        
        int indegree[] = new int[n+1];
        for(int i=0; i<m; i++) {
        	int s= sc.nextInt();
        	int e = sc.nextInt();
        	arr.get(s).add(e);
        	indegree[e]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 1; i<=n; i++) {
        	if(indegree[i] == 0) {
        		queue.offer(i);
        	}
        }
        while(!queue.isEmpty()) {
        	int now = queue.poll();
        	System.out.println(now + " ");
        	for(int next : arr.get(now)) {
        		indegree[next]--;
        		if(indegree[next]==0) {
        			queue.offer(next);
        		}
        	}
        }
    }
}