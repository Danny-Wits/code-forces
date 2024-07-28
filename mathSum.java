import java.util.Scanner;

public class mathSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        scanner.close();
        int[] count = new int[3];
        for (int i = 0; i < string.length(); i += 2) {
            count[Integer.parseInt(string.substring(i, i + 1)) - 1]++;
        }
        int i = 0;
        String result = "";
        while (i < 3) {
            if (count[i] == 0)
                i++;
            else {
                count[i]--;
                result += Integer.toString(i + 1) + "+";
            }
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}
