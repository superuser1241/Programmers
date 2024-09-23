import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        Integer[] num = new Integer[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            num[i] = str.charAt(i) - '0'; 
        }
        Arrays.sort(num, Collections.reverseOrder());
        
        StringBuilder sortedStr = new StringBuilder();
        for (int no : num) {
            sortedStr.append(no);
        }
        return Long.parseLong(sortedStr.toString());
    }
}