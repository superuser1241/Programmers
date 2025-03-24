import java.util.*;

class KeyEvent implements Comparable<KeyEvent> {
    int time, keyboard;
    char key;

    public KeyEvent(int time, int keyboard, char key) {
        this.time = time;
        this.keyboard = keyboard;
        this.key = key;
    }

    @Override
    public int compareTo(KeyEvent o) {
        if (this.time == o.time) return this.keyboard - o.keyboard;
        return this.time - o.time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<KeyEvent> events = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int keyboard = sc.nextInt();
            int time = sc.nextInt();
            char key = sc.next().charAt(0);
            events.add(new KeyEvent(time, keyboard, key));
        }

        Collections.sort(events);

        StringBuilder result = new StringBuilder();
        for (KeyEvent event : events) {
            result.append(event.key);
        }

        System.out.println(result);
    }
}
