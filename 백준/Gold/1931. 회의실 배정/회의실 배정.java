import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }
        Arrays.sort(meetings, (a, b) -> a[1] == b[1] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

        int count = 0;
        int endTime = 0;

        for (int i = 0; i < N; i++) {
            if (meetings[i][0] >= endTime) {
                endTime = meetings[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
