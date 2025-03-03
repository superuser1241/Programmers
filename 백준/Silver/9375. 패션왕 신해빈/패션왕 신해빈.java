import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            
            Map<String, Integer> categoryMap = new HashMap<>();
            
            for (int j = 0; j < n; j++) {
                String[] input = sc.nextLine().split(" ");
                String category = input[1];
                
                categoryMap.put(category, categoryMap.getOrDefault(category, 0) + 1);
            }
            
            int result = 1;
            for (int count : categoryMap.values()) {
                result *= (count + 1);
            }
            
            System.out.println(result - 1);
        }
    }
}
