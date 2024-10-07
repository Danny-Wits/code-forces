import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        List<Integer> diffList = new ArrayList<>();
        List<Integer> stepValueList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            diffList.add(list.get(i + 1) - list.get(i));
            if (i == 0)
                continue;
            stepValueList.add(list.get(i + 1) - list.get(i - 1));
        }
        int maxDiff = diffList.stream().max(Integer::compare).orElse(0);
        int minDiff = stepValueList.stream().min(Integer::compare).orElse(0);
        System.out.println(Math.max(maxDiff, minDiff));
        scanner.close();
    }
}
