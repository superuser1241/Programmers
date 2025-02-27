public class Main{
    public static void main(String[] args) throws Exception{
    	boolean[] isSelfNum = new boolean[10001];
    	
    	for (int i = 1; i <= 10000; i++) {
            int generated = d(i);
            if (generated <= 10000) {
                isSelfNum[generated] = true;
            }
        }
    	
    	for (int i = 1; i <= 10000; i++) {
            if (!isSelfNum[i]) {
                System.out.println(i);
            }
        }
    }
    static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
