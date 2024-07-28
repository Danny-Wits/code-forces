import java.util.ArrayList;
import java.util.Scanner;

public class q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sellers = scanner.nextInt();
        int money = scanner.nextInt();
        int validSellersNo = 0;
        ArrayList<Integer> validSellers = new ArrayList<>();

        for (int i = 1; i <= sellers; i++) {
            int items = scanner.nextInt();
            boolean flag = false;
            for (int j = 0; j < items; j++) {
                int item = scanner.nextInt();
                if (money > item) {
                    flag = true;
                }
            }
            if (flag) {
                validSellersNo++;
                validSellers.add(i);
            }
        }
        System.out.println(validSellersNo);
        validSellers.forEach((e) -> {
            System.out.print(e + " ");
        });
        scanner.close();
    }
}
