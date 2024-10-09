import java.util.Scanner;

public class Main {
    static int[] answer;
    static int[] select;
    static int count = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        answer = new int[10];
        
        for (int i = 0; i < 10; i++) {
        	answer[i] = sc.nextInt();
        }
        
        select = new int[10];
        calculate(0);
        System.out.println(count);
    }
    
    public static void calculate(int cnt) {
        if (cnt == 10) {
            int score = 0;
            for (int i = 0; i < 10; i++) {
                if (select[i] == answer[i]) {
                    score++;
                }
            }
            if (score >= 5) {
                count++;
            }
            return;
        }
        
        for (int i = 1; i <= 5; i++) {
            if (cnt >= 2 && select[cnt - 1] == i && select[cnt - 2] == i) {
                continue;
            }
            select[cnt] = i;
            calculate(cnt + 1);
        }
    }
}
