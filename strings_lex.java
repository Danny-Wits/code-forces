import java.util.Scanner;

public class strings_lex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next().toLowerCase();
        String string2 = scanner.next().toLowerCase();
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == string2.charAt(i))
                continue;
            else {
                System.out.println((string1.charAt(i) > string2.charAt(i)) ? 1 : -1);
                scanner.close();
                return;
            }
        }
        System.out.println(0);
        scanner.close();

    }
}
