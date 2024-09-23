class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        //0이면 true 나머지 false
        return x % sum == 0;
    }
}