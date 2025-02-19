import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        long[] P = new long[101];

        P[1] = 1;
        P[2] = 1;
        P[3] = 1;
        P[4] = 2;
        P[5] = 2;

        for (int i = 6; i <= 100; i++) {
            P[i] = P[i - 1] + P[i - 5];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(P[N]).append("\n");
        }

        System.out.print(sb.toString());
    }
}


