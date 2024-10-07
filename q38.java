import java.util.Scanner;

public class q38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerAGuess = scanner.nextInt();
        int playerBGuess = scanner.nextInt();
        int playerA, playerB, draw, guessErrorA, guessErrorB;
        playerA = playerB = draw = 0;
        for (int i = 1; i <= 6; i++) {
            guessErrorA = Math.abs(playerAGuess - i);
            guessErrorB = Math.abs(playerBGuess - i);
            if (guessErrorA < guessErrorB)
                playerA++;
            else if (guessErrorA > guessErrorB)
                playerB++;
            else
                draw++;
        }
        System.out.printf("%d %d %d", playerA, draw, playerB);
        scanner.close();
    }
}