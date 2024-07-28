import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // total no.
        int n = scanner.nextInt();
        // offer no.
        int m = scanner.nextInt();
        // normal cost
        int a = scanner.nextInt();
        // cost of m tickets
        int b = scanner.nextInt();

        int min = 0;
        // discount cost of one ticket
        double d = (b / m);
        // there is a discount
        if (d < a)
            min = (n / m) * b + Math.min((n % m) * a, b);
        // there is no discount
        else
            min = a * n;
        System.out.println(min);
        scanner.close();
    }
}
