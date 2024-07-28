import java.util.Scanner;

public class Gardern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point p1 = new Point(scanner.nextInt(), scanner.nextInt());
        Point p2 = new Point(scanner.nextInt(), scanner.nextInt());
        scanner.close();
        if (!p1.isValidFor(p2)) {
            System.out.println(-1);
            return;
        }
        int x3, y3, x4, y4;
        if (p1.isDiagonalFrom(p2)) {
            x3 = p2.x;
            y3 = p1.y;
            x4 = p1.x;
            y4 = p2.y;
            System.out.printf("%d %d %d %d", x3, y3, x4, y4);
        } else {
            int xd = Math.abs(p1.x - p2.x);
            int yd = Math.abs(p1.y - p2.y);
            if (p1.x == p2.x) {
                x3 = p1.x + yd;
                y3 = p1.y;
                x4 = p2.x + yd;
                y4 = p2.y;
            } else {
                x3 = p1.x;
                y3 = p1.y + xd;
                x4 = p2.x;
                y4 = p2.y + xd;
            }

            System.out.printf("%d %d %d %d", x3, y3, x4, y4);
        }

    }

    public record Point(int x,
            int y) {
        boolean isDiagonalFrom(Point p) {
            int xd = Math.abs(this.x - p.x);
            int yd = Math.abs(this.y - p.y);
            return xd == yd;
        }

        boolean isValidFor(Point p) {
            return isDiagonalFrom(p) || isSideFrom(p);
        }

        boolean isSideFrom(Point p) {
            return this.x == p.x || this.y == p.y;
        }

    }

}
