import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int sum=0;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String num = sc.next();
        char[] ch = num.toCharArray();
        
        for(int i =0; i<n; i++){
            sum += ch[i] - '0';
        }
        System.out.print(sum);
    }
}