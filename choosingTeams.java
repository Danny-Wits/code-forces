import java.util.Scanner;

public class choosingTeams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int qualified = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() <= (5 - k))
                qualified++;
        }
        System.out.println(qualified / 3);
        scanner.close();
    }
}
