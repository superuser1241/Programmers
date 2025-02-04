import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bd.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int  arr[][] = new int[n+1][n+1];
        
        for(int i=1; i<=n; i++) {
        	st = new StringTokenizer(bd.readLine());
        	for(int j=1; j<=n; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        int a[][] = new int[n+1][n+1];
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=n; j++) {
        		a[i][j] = a[i][j - 1] + a[i - 1][j] - a[i - 1][j - 1] + arr[i][j];
        	}
        }
        
        for(int i=0; i<m; i++) {
        	st = new StringTokenizer(bd.readLine());
        	int x1 = Integer.parseInt(st.nextToken());
        	int y1 = Integer.parseInt(st.nextToken());
        	int x2 = Integer.parseInt(st.nextToken());
        	int y2 = Integer.parseInt(st.nextToken());
        	
        	int result = a[x2][y2] - a[x1 - 1][y2] - a[x2][y1 - 1] + a[x1 - 1][y1 - 1];
        	System.out.println(result);
        }
    }
}
