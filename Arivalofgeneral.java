import java.util.Scanner;

public class Arivalofgeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int maxIndex = 0;
        int min = 100;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            if (height <= min) {
                min = height;
                minIndex = i;
            }
            if (height > max) {
                max = height;
                maxIndex = i;
            }
        }
        if (minIndex < maxIndex)
            minIndex++;
        System.out.println(maxIndex + (n - 1 - minIndex));
        scanner.close();
    }
}
