class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0; 
        
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            product *= num_list[i]; 
        }
        if (product < (sum * sum)) {
            return 1;
        } else {
            return 0; 
        }
    }
}
