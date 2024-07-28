import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String body = "#".repeat(m);
        String start = "#" + ".".repeat(m - 1);
        String end = ".".repeat(m - 1) + "#";

        boolean bodyF = true;
        boolean startF = false;
        int i = 0;
        while (i < n) {
            if (bodyF) {
                System.out.println(body);
                bodyF = false;
            } else {
                System.out.println(startF ? start : end);
                bodyF = true;
                startF = !startF;
            }
            i++;
        }
        scanner.close();
    }
}
