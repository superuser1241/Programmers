import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] sequence;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sequence = new int[M];

        dfs(1, 0);
    }

    public static void dfs(int start, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            sequence[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
