import java.io.*;
import java.util.*;

public class Main {
    static Set<Long> occupied = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long N = Long.parseLong(st.nextToken());
        int Q = Integer.parseInt(st.nextToken()); 
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < Q; i++) {
            long desiredLand = Long.parseLong(br.readLine()); 
            long conflictLand = 0; 
            
            long current = desiredLand;
            while (current > 1) {
                if (occupied.contains(current)) {
                    conflictLand = current;
                }
                current /= 2; 
            }

            if (conflictLand == 0) {
                sb.append(0).append("\n");
                occupied.add(desiredLand);
            } else {
                sb.append(conflictLand).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
