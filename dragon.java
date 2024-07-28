import java.util.ArrayList;
import java.util.Scanner;

public class dragon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        ArrayList<Drag> dragons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            dragons.add(new Drag(scanner.nextInt(), scanner.nextInt()));
        }

        ArrayList<Drag> winnable = new ArrayList<>();
        while (true) {

            for (int i = 0; i < dragons.size(); i++) {
                if (dragons.get(i).power < s) {
                    winnable.add(dragons.get(i));
                    dragons.remove(i);
                }
            }
            if (winnable.size() == 0)
                break;
            int maxIndex = 0, max = -1;
            for (int i = 0; i < winnable.size(); i++) {
                if (max <= winnable.get(i).bonus) {
                    max = winnable.get(i).bonus;
                    maxIndex = i;
                }
            }
            s += winnable.get(maxIndex).bonus;
            winnable.remove(maxIndex);
        }
        System.out.println((dragons.size() == 0) ? "YES" : "NO");
        scanner.close();
    }

    public record Drag(int power, int bonus) {
    }

}
