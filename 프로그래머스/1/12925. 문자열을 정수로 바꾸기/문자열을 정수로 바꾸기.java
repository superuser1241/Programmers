class Solution {
    public int solution(String s) {
        String calc = s.substring(0,1);
        if(calc.equals("-")){
            return Integer.parseInt(s.substring(0));
        }else{
            return Integer.parseInt(s);
        }
    }
}