import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        int maxBurgers = 0;
        int minColaTime = t;

        for (int i = 0; i * n <= t; i++) {
            int remainingTime = t - (i * n);
            int j = remainingTime / m;
            int colaTime = remainingTime % m;
            int burgerCount = i + j;

            if (colaTime < minColaTime) {
                maxBurgers = burgerCount;
                minColaTime = colaTime;
            } else if (colaTime == minColaTime) {
                maxBurgers = Math.max(maxBurgers, burgerCount);
            }
        }

        System.out.println(maxBurgers + " " + minColaTime);
    }
}
