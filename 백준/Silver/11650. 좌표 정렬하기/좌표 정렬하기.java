import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bd.readLine());

        List<Coordinate> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = bd.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            list.add(new Coordinate(x,y));
        }

        Collections.sort(list, (m1, m2) -> {
        	if(m1.x==m2.x) {
        		return m1.y - m2.y;
        	}return m1.x - m2.x;
        });

        for (Coordinate coordinate : list) {
            System.out.println(coordinate.x + " " + coordinate.y);
        }
    }
}
