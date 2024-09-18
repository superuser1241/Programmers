class Solution {
    public int solution(int[] num_list) {
        StringBuilder even = new StringBuilder(); 
        StringBuilder odd = new StringBuilder();
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even.append(num_list[i]);
            } else {
                odd.append(num_list[i]);
            }
        }
        
        int oddNum = Integer.parseInt(odd.toString());
        int evenNum = Integer.parseInt(even.toString());
        
        return oddNum + evenNum;
    }
}