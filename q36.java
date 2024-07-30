import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class q36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int laptopCount = scanner.nextInt();
        List<Laptop> laptopList = new ArrayList<>();
        for (int i = 0; i < laptopCount; i++) {
            laptopList.add(new Laptop(scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(laptopList);
        boolean flag = false;
        int previous = 0;
        for (int i = laptopCount - 1; i >= 1; i--) {
            previous = laptopList.get(i).quality;
            if (previous < laptopList.get(i - 1).quality) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "Happy Alex" : "Poor Alex");
        scanner.close();
    }

    record Laptop(int prise,
            int quality) implements Comparable<Laptop> {

        @Override
        public int compareTo(q36.Laptop o) {
            if (this.prise > o.prise)
                return 1;
            if (this.prise < o.prise)
                return -1;
            return 0;
        }

    }
}