import java.util.Scanner;

public class Ilya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int state = scanner.nextInt();
        int max = Math.max(state, Math.max((state / 100) * 10 + (state % 10), state / 10));
        System.out.println(max);
        scanner.close();
    }
}
