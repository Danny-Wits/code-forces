import java.util.ArrayList;
import java.util.Scanner;

public class Joker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        ArrayList<Integer> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            songs.add(scanner.nextInt());
        }
        int songTime = songs.stream().reduce(0, Integer::sum);
        int breaks = songs.size() - 1;
        int breakTime = breaks * 10;
        int totalTime = songTime + breakTime;
        int jokes = (totalTime <= d) ? (breaks * 2) + ((d - totalTime) / 5) : -1;
        System.out.println(jokes);
        scanner.close();
    }
}
