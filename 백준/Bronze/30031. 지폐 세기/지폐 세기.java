import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Map<Integer, Integer> moneyMap = new HashMap<>();
        moneyMap.put(136, 1000);
        moneyMap.put(142, 5000);
        moneyMap.put(148, 10000);
        moneyMap.put(154, 50000);
        
        int totalAmount = 0;
        
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int width = Integer.parseInt(input[0]);
            totalAmount += moneyMap.getOrDefault(width, 0);
        }
        
        System.out.println(totalAmount);
    }
}
