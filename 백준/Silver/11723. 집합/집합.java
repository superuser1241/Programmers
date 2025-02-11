import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bd.readLine());
        
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] command = bd.readLine().split(" ");
            
            switch (command[0]) {
                case "add":
                	set.add(Integer.parseInt(command[1]));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(command[1]));
                    break;
                case "check":
                    sb.append(set.contains(Integer.parseInt(command[1])) ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    if(set.contains(Integer.parseInt(command[1]))) {
                    	set.remove(Integer.parseInt(command[1]));
                    }else set.add(Integer.parseInt(command[1]));
                    break;
                case "all":
                	set.clear();
                    for(int j=1; j<=20; j++) {
                    	set.add(j);
                    }
                    break;
                case "empty":
                	set.clear();
                    break;
            }
        }
        System.out.print(sb);
    }
}
