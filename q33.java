import java.util.ArrayList;
import java.util.Scanner;

public class q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Board board = new Board(n, scanner);
        System.out.println(board.isValid() ? "YES" : "NO");
        scanner.close();
    }

    static class Board {
        ArrayList<ArrayList<Character>> map = new ArrayList<>();
        int size;

        Board(int n, Scanner scanner) {
            this.size = n;
            for (int i = 0; i < n; i++) {
                this.map.add(new ArrayList<>());
                String row = scanner.next();
                for (int j = 0; j < n; j++) {
                    map.get(i).add(row.charAt(j));
                }
            }
        }

        public boolean isValid() {
            boolean valid = true;
            outer: for (int i = 0; i < this.size; i++) {
                for (int j = 0; j < this.size; j++) {
                    int even = 0;
                    for (Character c : getAdjacent(i, j)) {
                        if (c == 'o')
                            even++;
                    }
                    if (even % 2 != 0) {
                        valid = false;
                        break outer;
                    }
                }
            }
            return valid;
        }

        ArrayList<Character> getAdjacent(int i, int j) {
            ArrayList<Character> result = new ArrayList<>();
            if (i > 0)
                result.add(this.map.get(i - 1).get(j));
            if (i < this.size - 1)
                result.add(this.map.get(i + 1).get(j));
            if (j > 0)
                result.add(this.map.get(i).get(j - 1));
            if (j < this.size - 1)
                result.add(this.map.get(i).get(j + 1));
            return result;
        }

    }

}
