import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum =0;
        String num = Integer.toString(n);
        
        for(int i=0; i<num.length(); i++){
            sum += Integer.parseInt(num.substring(i,i+1));
        }

        return sum;
    }
}