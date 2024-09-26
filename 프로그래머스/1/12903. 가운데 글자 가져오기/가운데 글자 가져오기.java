class Solution {
    public String solution(String s) {
        int len = s.length();
        int mid = len/2;
        
        if(len%2==1){
            return s.substring(mid,mid+1);
        }
        else {
            return s.substring(mid-1,mid+1);
        }
        
    }
}