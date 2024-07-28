import java.util.HashSet;
import java.util.Scanner;

public class beTheGuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int target = scanner.nextInt();
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            set.add(scanner.nextInt());
        }
        int y = scanner.nextInt();
        for (int i = 0; i < y; i++) {
            set.add(scanner.nextInt());
        }
        System.out.println((set.size() == target) ? "I become the guy." : "Oh, my keyboard!");
        scanner.close();
    }
}
