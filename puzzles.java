import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class puzzles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        n--;
        for (int i = 0; i + n < m; i++) {
            min = Math.min(min, list.get(i + n) - list.get(i));
        }
        System.out.println(min);
        scanner.close();
    }
}
