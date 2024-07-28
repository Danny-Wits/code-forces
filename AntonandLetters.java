import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AntonandLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        s = s.substring(1, s.length() - 1);
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] charList = s.split(", ");
            HashSet<String> set = new HashSet<>(Arrays.asList(charList));
            System.out.println(set.size());
        }

    }
}
