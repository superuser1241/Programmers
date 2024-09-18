import java.util.Arrays; 
class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length - 1]; 
        int secondLast = num_list[num_list.length - 2];
        
        int[] result = Arrays.copyOf(num_list, num_list.length + 1);
        
        if (last > secondLast) {
            result[result.length - 1] = last - secondLast; 
        } else {
            result[result.length - 1] = last * 2;
        }
        
        return result; 
    }
}
