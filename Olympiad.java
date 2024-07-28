import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Olympiad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, new ArrayList<>());
        map.put(2, new ArrayList<>());
        map.put(3, new ArrayList<>());
        for (int i = 0; i < n; i++) {
            int type = scanner.nextInt();
            map.get(type).add(i + 1);
        }
        int maxTeams = Math.min(map.get(1).size(), Math.min(map.get(2).size(), map.get(3).size()));
        System.out.println(maxTeams);
        int i = 0;
        while (i < maxTeams) {
            int p1 = map.get(1).get(i);
            int p2 = map.get(2).get(i);
            int p3 = map.get(3).get(i);
            System.out.printf("%d %d %d\n", p1, p2, p3);
            i++;
        }
        scanner.close();
    }
}
