import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * cinema
 */
public class cinema {
    /**
     * Query Helper inner class
     */

    public static class Query {
        public int x;
        public int y;
        public boolean filled;

        public Query(int x, int y, boolean filled) {
            this.x = x;
            this.y = y;
            this.filled = filled;
        }

        public int absDif(Query that) {
            return Math.abs(this.x - that.x) + Math.abs(this.y - that.y);
        }

        @Override
        public String toString() {
            return String.format("%d %d", x, y);
        }

        public boolean equals(Query that) {
            return ((this.x == that.x) && (that.y == this.y));
        }

        public void print() {
            System.out.printf("%d %d\n", x, y);
        }
    }

    public static void main(String[] args) {
        // !INPUT
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        List<Query> requests = new ArrayList<>();
        List<Query> cinemaSeats = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinemaSeats.add(new Query(i + 1, j + 1, false));
            }
        }
        for (int i = 0; i < k; i++) {
            requests.add(new Query(scanner.nextInt(), scanner.nextInt(), true));
        }

        scanner.close();

        // !RUNNING EACH QUERY
        for (Query query : requests) {
            Query wantedSeat = cinemaSeats.get((query.x - 1) * m + query.y - 1);
            // if seat is not filled fill it
            if (!wantedSeat.filled) {
                cinemaSeats.get((query.x - 1) * m + query.y - 1).filled = true;
                wantedSeat.print();
            } else {
                List<Query> minList = new ArrayList<>();
                // min set to max
                int min = Integer.MAX_VALUE;

                for (Query seat : cinemaSeats) {
                    // skipping filled seats
                    if (seat.filled) {
                        continue;
                    }
                    // finding difference between query and the seat
                    int dif = query.absDif(seat);
                    // if seat is of same difference adding it to minList
                    if (dif == min) {
                        minList.add(seat);
                    }
                    if (dif < min) {
                        // if a smaller seat with smaller list is found clear the old list and add this
                        // seat
                        min = dif;
                        minList.clear();
                        minList.add(seat);
                    }

                }
                // if list had a unique seat print and fill it
                if (minList.size() == 1) {
                    minList.get(0).print();
                    cinemaSeats.get((minList.get(0).x - 1) * m + minList.get(0).y - 1).filled = true;
                } else {
                    List<Query> minXList = new ArrayList<>();
                    min = minList.get(0).x;
                    for (Query seat : minList) {
                        if (seat.x == min) {
                            minXList.add(seat);
                        }
                    }
                    // since seats are added in order first one will be the one with the smallest y
                    // value
                    minXList.get(0).print();
                    cinemaSeats.get((minXList.get(0).x - 1) * m + minXList.get(0).y - 1).filled = true;
                }

            }
        }

    }

}