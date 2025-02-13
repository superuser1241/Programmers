import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bd.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> siteMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bd.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            siteMap.put(site, password);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String query = bd.readLine();
            sb.append(siteMap.get(query)).append("\n");
        }

        System.out.print(sb);
    }
}
