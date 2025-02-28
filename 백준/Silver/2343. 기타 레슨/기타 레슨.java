import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int middle = (start + end) / 2;
            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (sum + arr[i] > middle) { 
                    count++; 
                    sum = 0;
                }
                sum += arr[i]; 
            }

            if (sum > 0) count++;

            if (count > m) { 
                start = middle + 1;
            } else {
                end = middle;
            }
        }

        System.out.println(start);
    }
}