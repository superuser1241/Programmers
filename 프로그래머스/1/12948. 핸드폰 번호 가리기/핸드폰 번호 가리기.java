class Solution {
    public String solution(String phone_number) {
        String lastnum= phone_number.substring(phone_number.length()-4);
        String num= phone_number.substring(0,phone_number.length()-4);
        String phone = num.replaceAll(".","*") + lastnum;
        
        return phone;
    }
    
}