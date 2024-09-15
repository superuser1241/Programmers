class Solution {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        int abValue = Integer.parseInt(ab);
        
        int Value = 2 * a * b;
        
        if (abValue >= Value) {
            return abValue;
        } else {
            return Value;
        }
        
    }
}