import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bd.readLine());
        String[] arr1 = bd.readLine().split(" ");
        
        int m = Integer.parseInt(bd.readLine());
        String[] arr2 = bd.readLine().split(" ");
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(arr1[i]));
        }

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(arr2[i]);
            if (set.contains(num)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
