import java.util.Scanner;

public class q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int maxProfit = 0;
        int ratePrev = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int rateNow = scanner.nextInt();
            maxProfit = Math.max(maxProfit, ratePrev - rateNow);
            ratePrev = rateNow;
        }
        int netProfit = maxProfit - c;
        System.out.println((netProfit >= 0) ? netProfit : 0);
        scanner.close();
    }
}
