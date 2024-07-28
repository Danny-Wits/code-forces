import java.util.Scanner;

public class dubStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();
        scanner.close();
        String oldSong = song.replaceAll("(WUB)+", " ").trim();
        System.out.println(oldSong);
    }
}
