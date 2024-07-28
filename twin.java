import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class twin {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        BinaryOperator<Integer> sumFunction = twin::sum;

        int sum = list.stream().reduce(0, sumFunction);
        System.out.println(sum);
        Collections.sort(list, Comparator.reverseOrder());
        int curSum = 0;
        int coins = 0;
        while (curSum <= sum / 2) {
            // System.out.println(list.get(coins) + ",");
            curSum += list.get(coins);
            coins++;
        }
        System.out.println(coins);
    }

    public static <T> Integer sum(T a, T b) {
        return a.hashCode() + b.hashCode();
    }
}
