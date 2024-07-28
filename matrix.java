import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            i++;
            if (num == 1)
                break;
        }
        int x = (i - 1) / 5;
        int y = (i - 1) % 5;
        System.out.println(Math.abs(2 - x) + Math.abs(2 - y));
        scanner.close();
    }
}
