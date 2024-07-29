import java.util.Scanner;

public class q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restaurantCount = scanner.nextInt();
        int timeAlloted = scanner.nextInt();
        int maxFun = Integer.MIN_VALUE;
        for (int i = 0; i < restaurantCount; i++) {
            int fun = scanner.nextInt();
            int time = scanner.nextInt();
            int timeRemaining = timeAlloted - time;
            timeRemaining = (timeRemaining > 0) ? 0 : timeRemaining;
            maxFun = Math.max(maxFun, fun + timeRemaining);
        }
        System.out.println(maxFun);
        scanner.close();
    }

}