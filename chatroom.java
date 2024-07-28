import java.util.Scanner;

public class chatroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String hello = "hello";
        int x = 0;
        scanner.close();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == hello.charAt(x)) {
                if (x == 4) {
                    System.out.println("YES");
                    return;
                }
                x++;
            }
        }
        System.out.println("NO");

    }
}
