import java.util.Scanner;

/**
 * watermelon
 */
public class watermelon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 3)
            System.out.println("NO");
        else
            System.out.println((x % 2 == 0) ? "YES" : "NO");
        scanner.close();
    }
}