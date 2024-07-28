import java.util.ArrayList;
import java.util.Scanner;

public class q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<String> map = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            map.add(scanner.next());
        }
        int rows = 0;
        for (int i = 0; i < n; i++) {
            if (!map.get(i).contains("S")) {
                rows++;
            }
        }
        int columns = 0;
        for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (map.get(j).charAt(i) == 'S') {
                    flag = true;
                }
            }
            if (!flag) {
                columns++;
            }
        }
        System.out.println((rows * m) + (columns * (n - rows)));
        scanner.close();
    }
}
