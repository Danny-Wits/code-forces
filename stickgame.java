import java.util.Scanner;

public class stickgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        if (isEven(m) && isEven(n)) {
            System.out.println("Malvika");
            return;
        } else if (!isEven(m) ^ !isEven(n)) {
            if (!isEven(m)) {
                if (m > n) {
                    System.out.println("Malvika");
                    return;
                }
            } else if (n > m) {
                System.out.println("Malvika");
                 return; 
                 
            }
        }
        System.out.println("Akshat");
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
