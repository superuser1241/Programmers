import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String skills = br.readLine();

        int count = 0;
        Deque<Character> lQueue = new ArrayDeque<>();
        Deque<Character> sQueue = new ArrayDeque<>();

        for (char skill : skills.toCharArray()) {
            if (skill >= '1' && skill <= '9') {
                count++;
            } else if (skill == 'L') {
                lQueue.addLast('L');
            } else if (skill == 'S') {
                sQueue.addLast('S');
            } else if (skill == 'R') {
                if (lQueue.isEmpty()) {
                    break;
                }
                count++;
                lQueue.pollFirst();
            } else if (skill == 'K') {
                if (sQueue.isEmpty()) {
                    break;
                }
                count++;
                sQueue.pollFirst();
            }
        }

        System.out.println(count);
    }
}
