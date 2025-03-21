import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int totalScore = 0;
        int bonus = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'O') {
                totalScore += (i + 1) + bonus;
                bonus++;
            } else {
                bonus = 0;
            }
        }

        System.out.println(totalScore);
    }
}
