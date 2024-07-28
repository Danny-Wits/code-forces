import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evenness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (scanner.nextInt() % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        System.out.println((even.size() < odd.size()) ? even.get(0) : odd.get(0));
        scanner.close();
    }
}
