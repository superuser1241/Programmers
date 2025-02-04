import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int score[] = new int[n];
        for(int i =0; i<n; i++){
            score[i]= sc.nextInt();
        }
        
        int sum=0;
        int max=0;
        
        for(int j=0; j<n; j++){
            if(score[j]>max){
                max = score[j];
            }
            sum += score[j];
        }
        System.out.println(sum * 100.0/max/n);
    }
}