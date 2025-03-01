import java.util.*;

public class Main {
    static List<Integer> digits = new ArrayList<>();
    static int maxNumber = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        for (int i = 0; i < K; i++) {
            digits.add(sc.nextInt());
        }
        sc.close();
        
        Collections.sort(digits, Collections.reverseOrder());
        findLargest(N, "");
        
        System.out.println(maxNumber);
    }
    
    public static void findLargest(int N, String current) {
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            if (num <= N) {
                maxNumber = Math.max(maxNumber, num);
            } else {
                return;
            }
        }
        
        if (current.length() < String.valueOf(N).length()) {
            for (int digit : digits) {
                findLargest(N, current + digit);
            }
        }
    }
}
