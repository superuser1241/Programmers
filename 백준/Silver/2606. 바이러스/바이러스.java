import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] network;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        network = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            network[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            network[a].add(b);
            network[b].add(a);
        }
        visited = new boolean[n + 1];
        dfs(1);
        int infectedCount = 0;
        for (int i = 2; i <= n; i++) {
            if (visited[i]) {
                infectedCount++;
            }
        }
        System.out.println(infectedCount);
    }
    static void dfs(int computer) {
        visited[computer] = true;
        for (int nextComputer : network[computer]) {
            if (!visited[nextComputer]) {
                dfs(nextComputer);
            }
        }
    }
}
