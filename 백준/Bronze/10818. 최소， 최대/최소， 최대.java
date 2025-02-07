import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            return;
        }
        
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[arr.length-1];
        
        System.out.println(min+" "+max);
    }
}