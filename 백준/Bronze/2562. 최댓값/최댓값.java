import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<9; i++) {
        	list.add(sc.nextInt());
        }
        
        int max = list.get(0);
        int index = 1;
        for(int i=1; i<9; i++) {
        	if(list.get(i)>max) {
        		max = list.get(i);
        		index = i+1;
        	}
        }
        
        System.out.println(max);
        System.out.println(index);
        
    }
}