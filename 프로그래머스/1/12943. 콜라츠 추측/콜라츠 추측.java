class Solution {
    public int solution(long num) {
        long temp = num;
        int count =0;
        
        while(temp!=1){
            if (count >= 500) {
                return -1;
            }
            else if(temp%2==0){
                temp = temp/2;
                count++;
            }else if(temp%2==1){
                temp = (temp*3)+1;
                count++;
            }
        }
        return count;
    }
}