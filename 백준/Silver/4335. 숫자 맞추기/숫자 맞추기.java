import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int min = 1, max = 10;
            boolean honest = true;
            
            while (true) {
                int guess = sc.nextInt();
                if (guess == 0) return;
                
                sc.nextLine();
                String response = sc.nextLine();
                
                if (response.equals("right on")) {
                    if (guess < min || guess > max) honest = false;
                    
                    System.out.println(honest ? "Stan may be honest" : "Stan is dishonest");
                    break;
                } else if (response.equals("too high")) {
                    if (guess <= min) honest = false;
                    max = Math.min(max, guess - 1);
                } else if (response.equals("too low")) {
                    if (guess >= max) honest = false;
                    min = Math.max(min, guess + 1);
                }
            }
        }
    }
}
