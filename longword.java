import java.util.Scanner;

public class longword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int x = scanner.nextInt();

        while (scanner.hasNext()) {
            String string = scanner.next();
            if (string.length() <= 10)
                System.out.println(string);
            else
                System.out.println(
                        string.charAt(0) + Integer.toString(string.length() - 2) + string.charAt(string.length() - 1));
        }
        scanner.close();
    }
}
