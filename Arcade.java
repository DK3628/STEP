import java.util.Scanner;
import java.util.Random;

public class Arcade{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int wins = 0, losses = 0, draws = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nRound " + i);
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("Enter your choice: ");

            int player = sc.nextInt();
            int computer = r.nextInt(3) + 1;

            System.out.println("Computer Choice: " + computer);

            switch (player) {

                case 1: // Rock
                    switch (computer) {
                        case 1:
                            System.out.println("Draw");
                            draws++;
                            break;
                        case 2:
                            System.out.println("Computer Wins");
                            losses++;
                            break;
                        case 3:
                            System.out.println("Player Wins");
                            wins++;
                            break;
                    }
                    break;

                case 2: // Paper
                    switch (computer) {
                        case 1:
                            System.out.println("Player Wins");
                            wins++;
                            break;
                        case 2:
                            System.out.println("Draw");
                            draws++;
                            break;
                        case 3:
                            System.out.println("Computer Wins");
                            losses++;
                            break;
                    }
                    break;

                case 3: // Scissors
                    switch (computer) {
                        case 1:
                            System.out.println("Computer Wins");
                            losses++;
                            break;
                        case 2:
                            System.out.println("Player Wins");
                            wins++;
                            break;
                        case 3:
                            System.out.println("Draw");
                            draws++;
                            break;
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
                    i--; // Repeat the round
            }
        }

        double winPercentage = (wins * 100.0) / 5;

        System.out.println("\n----- Final Result -----");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");

        sc.close();
    }
}