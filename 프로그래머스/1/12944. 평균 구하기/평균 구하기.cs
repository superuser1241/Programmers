public class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.Length; i++){
            sum = sum + arr[i];
        }
        return (double)sum / arr.Length;
    }
}