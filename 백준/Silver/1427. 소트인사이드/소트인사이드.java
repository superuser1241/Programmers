import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int arr[] = new int[st.length()];

        for (int i = 0; i < st.length(); i++) {
            arr[i] = Integer.parseInt(st.substring(i,i+1));
        }
        for(int i=0; i<st.length(); i++) {
        	int max = i;
        	for(int j=i+1; j<st.length(); j++) {
        		if(arr[j]>arr[max]) {
        			max =j;
        		}
        	}if(arr[i]<arr[max]) {
        		int temp = arr[i];
        		arr[i] = arr[max];
        		arr[max] = temp;
        	}
        }
        for(int i=0; i<st.length(); i++) {
        	System.out.print(arr[i]);
        }
    }
}
