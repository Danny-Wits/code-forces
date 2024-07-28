import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class luckynumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        List<Integer> luckyNumbers = new ArrayList<>(
                Arrays.asList(4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777));
        boolean flag = false;
        for (Integer integer : luckyNumbers) {
            if (number % integer == 0) {
                flag = true;
                break;
            }
            if (number < integer)
                break;
        }
        System.out.println((flag) ? "YES" : "NO");
    }
}
