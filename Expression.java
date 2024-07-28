import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.close();

        if (x != 1 && y != 1 && z != 1) {
            System.out.println(x * y * z);
        } else {
            if (x == 1 && y == 1 && z == 1) {
                System.out.println(3);
            } else if (x == 1 && y == 1) {
                System.out.println(2 * z);
            } else if (y == 1 && z == 1) {
                System.out.println(2 * x);
            } else if (x == 1 && z == 1) {
                System.out.println(2 + y);
            } else if (x == 1) {
                System.out.println((x + y) * z);
            } else if (y == 1) {
                if (x > z) {
                    System.out.println((z + 1) * x);
                } else {
                    System.out.println((x + 1) * z);
                }
            } else {
                System.out.println(x * (y + 1));
            }

        }

    }
}
