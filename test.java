import java.util.*;

public class test {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Query query = (Query) o;
            return x == query.x && y == query.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
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
        PriorityQueue<Query> availableSeats = new PriorityQueue<>(Comparator.comparingInt((Query q) -> q.x).thenComparingInt(q -> q.y));
        Set<Query> filledSeats = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                availableSeats.add(new Query(i, j, false));
            }
        }
        for (int i = 0; i < k; i++) {
            requests.add(new Query(scanner.nextInt(), scanner.nextInt(), true));
        }

        scanner.close();

        // !RUNNING EACH QUERY
        for (Query query : requests) {
            Query wantedSeat = new Query(query.x, query.y, false);

            if (filledSeats.contains(wantedSeat)) {
                // Find the closest available seat
                Query closestSeat = null;
                int minDist = Integer.MAX_VALUE;
                for (Query seat : availableSeats) {
                    if (!filledSeats.contains(seat)) {
                        int dist = query.absDif(seat);
                        if (dist < minDist) {
                            minDist = dist;
                            closestSeat = seat;
                        } else if (dist == minDist) {
                            if (seat.x < closestSeat.x || (seat.x == closestSeat.x && seat.y < closestSeat.y)) {
                                closestSeat = seat;
                            }
                        }
                    }
                }
                if (closestSeat != null) {
                    closestSeat.print();
                    filledSeats.add(closestSeat);
                    availableSeats.remove(closestSeat);
                }
            } else {
                wantedSeat.print();
                filledSeats.add(wantedSeat);
                availableSeats.remove(wantedSeat);
            }
        }
    }
}

