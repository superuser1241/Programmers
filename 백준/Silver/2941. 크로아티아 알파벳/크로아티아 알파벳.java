import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
    	String st = sc.next();
    	
    	String alpha[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    	
    	for (String croatian : alpha) {
    		st = st.replace(croatian, "*");
        }
    	
    	System.out.println(st.length());
    }
}