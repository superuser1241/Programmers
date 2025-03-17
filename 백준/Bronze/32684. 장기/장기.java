import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] scores = {13, 7, 5, 3, 3, 2};
        int choScore = 0;
        for (int i = 0; i < 6; i++) {
            choScore += sc.nextInt() * scores[i];
        }
        
        double hanScore = 1.5;
        for (int i = 0; i < 6; i++) {
            hanScore += sc.nextInt() * scores[i];
        }  
        sc.close();

        if (choScore > hanScore) {
            System.out.println("cocjr0208");
        } else {
            System.out.println("ekwoo");
        }
    }
}