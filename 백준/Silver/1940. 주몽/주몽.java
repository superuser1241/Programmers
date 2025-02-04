import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        int item = Integer.parseInt(bd.readLine());
        int sum = Integer.parseInt(bd.readLine());
        int count=0;
        int arr[] = new int[item];
        StringTokenizer st = new StringTokenizer(bd.readLine());
        
        for(int i=0; i<item; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        int i=0;
        int j=item-1;
        
        while(i<j){
            if(arr[i] + arr[j] < sum){
                i++;
            }else if(arr[i] + arr[j] > sum){
                j--;
            }else{
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}