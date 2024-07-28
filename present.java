import java.util.Scanner;

public class present {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] giftRecieved = new int[n];
        for (int i = 0; i < n; i++) {
            giftRecieved[scanner.nextInt() - 1] = i + 1;
        }
        for (int i : giftRecieved) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
