import java.util.Scanner;

public class evenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long k = scanner.nextLong();
        scanner.close();
        long mid = (x % 2 == 0) ? x / 2 : x / 2 + 1;
        if (k > mid) {
            System.out.println((k - mid) * 2);
        } else {
            System.out.println(k * 2 - 1);
        }

    }
}
