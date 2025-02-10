import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(bd.readLine());
    	
    	int arr[] = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = Integer.parseInt(bd.readLine());
    	}
    	Arrays.sort(arr);
    	
    	for(int i=0; i<n; i++) {
    		System.out.println(arr[i]);
    	}
    }
}