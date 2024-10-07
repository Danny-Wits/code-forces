
import java.util.*;

public class q40 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] exercises = new int[3];
        int eIndex = 0;
        for (int i = 0; i < n; i++) {
            if (eIndex == 3)
                eIndex = 0;
            exercises[eIndex] += scanner.nextInt();
            eIndex++;
        }
        int max = Arrays.stream(exercises).max().orElse(0);

        if (exercises[0] == max)
            System.out.println("chest");
        else if (exercises[1] == max)
            System.out.println("biceps");
        else
            System.out.println("back");
        scanner.close();
    }
}

