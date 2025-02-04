import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bd.readLine());
        
        int n= Integer.parseInt(st.nextToken());
        int q= Integer.parseInt(st.nextToken());
        
        int[] s= new int[n+1];
        st = new StringTokenizer(bd.readLine());
        
        for(int i=1; i<=n; i++){
            s[i]= s[i-1] + Integer.parseInt(st.nextToken());
        }
        
        for(int j=0; j<q; j++){
            st = new StringTokenizer(bd.readLine());
            int k= Integer.parseInt(st.nextToken());
            int h= Integer.parseInt(st.nextToken());
            System.out.println(s[h]-s[k-1]);
        }
    }
}