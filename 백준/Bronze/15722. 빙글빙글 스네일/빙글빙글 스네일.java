import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int x = 0, y = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int direction = 0;
        int step = 1;
        int moveCount = 0;

        for (int i = 0; i < n; i++) {
            x += dx[direction]; 
            y += dy[direction]; 

            moveCount++;
            if (moveCount == step) {
                direction = (direction + 1) % 4;
                moveCount = 0;
                if (direction == 0 || direction == 2) {
                    step++;
                }
            }
        }
        
        System.out.println(x + " " + y);
    }
}