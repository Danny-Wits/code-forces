import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stringLatin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next().toLowerCase();
        List<Character> vowel = new ArrayList<>();

        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('y');

        String result = "";

        for (int i = 0; i < string.length(); i++) {
            if (!vowel.contains(string.charAt(i))) {
                result += "." + string.charAt(i);
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
