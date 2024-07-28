import java.util.Scanner;

public class Dreamoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        for (int i = (int) Math.ceil((double) n / 2); i <= n; i++) {
            if (i % m == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
