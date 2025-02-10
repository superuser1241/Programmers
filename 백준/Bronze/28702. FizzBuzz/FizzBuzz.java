import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
        }

        int startNum = 0;
        for (int i = 0; i < 3; i++) {
            if (!arr[i].equals("Fizz") && !arr[i].equals("Buzz") && !arr[i].equals("FizzBuzz")) {
                startNum = Integer.parseInt(arr[i]) - i;
                break;
            }
        }

        int lastNum = startNum + 2;
        
        int nextNum = lastNum + 1;
        
        if (nextNum % 3 == 0 && nextNum % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (nextNum % 3 == 0) {
            System.out.println("Fizz");
        } else if (nextNum % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nextNum);
        }
    }
}
