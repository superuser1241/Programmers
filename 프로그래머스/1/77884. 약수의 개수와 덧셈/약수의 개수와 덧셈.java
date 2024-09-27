class Solution {
    public int solution(int left, int right) {
        int result=0;
        for(int i=left; i<=right; i++){
            if (Math.sqrt(i) == (int)Math.sqrt(i)) {
                result -= i; 
            } else {
                result += i;
            }
        }
        return result;
    }
}