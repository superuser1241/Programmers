import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomNumber = sc.next();
        sc.close();
        
        int[] digitCount = new int[10];
        
        for (char c : roomNumber.toCharArray()) {
            digitCount[c - '0']++;
        }
        
        int sixNineCount = (digitCount[6] + digitCount[9] + 1) / 2;
        digitCount[6] = sixNineCount;
        digitCount[9] = sixNineCount;
        
        int maxSet = 0;
        for (int count : digitCount) {
            maxSet = Math.max(maxSet, count);
        }
        
        System.out.println(maxSet);
    }
}
