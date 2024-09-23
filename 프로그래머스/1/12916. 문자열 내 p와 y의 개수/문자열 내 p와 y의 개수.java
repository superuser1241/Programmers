class Solution {
    boolean solution(String s) {
        int countP=0;
        int countY=0;
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("p")||s.substring(i,i+1).equals("P")){
                countP++;
            }else if(s.substring(i,i+1).equals("y")||s.substring(i,i+1).equals("Y")){
                countY++;
            }
        }
        if(countP==countY){
            return true;
        }else return false;
    }
}