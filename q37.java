import java.util.Scanner;

public class q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalFriends = scanner.nextInt();
        int bottleCount = scanner.nextInt();
        int bottleSize = scanner.nextInt();
        int limeCount = scanner.nextInt();
        int limeSlice = scanner.nextInt();
        int salt = scanner.nextInt();
        int drinkNeeded = scanner.nextInt();
        int saltNeeded = scanner.nextInt();

        int totalDrink = bottleCount * bottleSize;
        int totalLime = limeCount * limeSlice;
        System.out.println(Math.min(totalDrink / drinkNeeded, Math.min(totalLime, salt / saltNeeded)) / totalFriends);
        scanner.close();
    }
}
