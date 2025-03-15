import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	String input[] = br.readLine().split(" ");
            int num[] = new int[input.length];
            
            for (int i = 0; i < input.length; i++) {
                num[i] = Integer.parseInt(input[i]);
            }
            if(num[0]>num[1]) {
            	System.out.println("Yes");
            }else if(num[0]==0 && num[1]==0){
            	break;
            }else System.out.println("No");
        }
    }
}
