import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> guest = new ArrayList<>();
        Map<Integer, Integer> host = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            host.put(h, host.getOrDefault(h, 0) + 1);
            guest.add(scanner.nextInt());
        }
        int result = 0;
        for (Integer integer : guest) {
            if (host.containsKey(integer))
                result += host.get(integer);
        }
        System.out.println(result);
        scanner.close();
    }
}
