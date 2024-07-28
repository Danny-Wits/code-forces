import java.util.Scanner;

public class youngPhysicist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x, y, z;
        x = y = z = 0;
        for (int i = 0; i < n; i++) {
            x += scanner.nextInt();
            y += scanner.nextInt();
            z += scanner.nextInt();
        }
        System.out.println((x == 0 && y == 0 && z == 0) ? "YES" : "NO");
        scanner.close();
    }
}