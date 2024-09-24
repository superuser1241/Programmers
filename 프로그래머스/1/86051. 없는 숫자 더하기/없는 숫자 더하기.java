class Solution {
    public int solution(int[] numbers) {
        int total =45;
        int sum =0;
        
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        
        return total-sum;
    }
}