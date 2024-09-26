class Solution {
    public String solution(int n) {
        StringBuilder result = new StringBuilder();
        
        
            for(int i =0; i<n; i++){
                
                if (i % 2 == 0) {
                    result.append("수");
                } else {
                    result.append("박");
                }
            }
        return result.toString();
        
    }
}