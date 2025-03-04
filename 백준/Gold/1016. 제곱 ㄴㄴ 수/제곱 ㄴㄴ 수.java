import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        
        boolean Check[] = new boolean[(int)(max - min +1)];
        
        for(long i=2; i*i <=max; i++) {
        	long po = i*i;
        	long start = min/po;
        	if(min%po !=0) {
        		start++;
        	}
        	for(long j=start; po*j <=max; j++) {
        		Check[(int)((j*po) - min)] =true;
        	}
        }
        int count=0;
        for(int i =0; i<=max - min; i++) {
        	if(!Check[i]) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}