import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        Map<Integer, Integer> cardCount = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            int card = sc.nextInt();
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }

        int M = sc.nextInt();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int query = sc.nextInt();
            result.append(cardCount.getOrDefault(query, 0)).append(" ");
        }
        
        System.out.println(result.toString());
    }
}
