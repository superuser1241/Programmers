import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Set<String> list = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
        	list.add(br.readLine());
        }
        
        List<String> wordList = new ArrayList<>(list);
        
        Collections.sort(wordList, (word1, word2) -> {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2);
            } else {
                return word1.length() - word2.length();
            }
        });
        
        for (String word : wordList) {
            bw.write(word + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}