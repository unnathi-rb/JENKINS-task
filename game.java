import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String userChoice, computerChoice;
        String playAgain;

        System.out.println("Welcome to Rock-Paper-Scissors!");

        do {
            // User input
            System.out.print("Enter your choice (rock, paper, scissors): ");
            userChoice = scanner.nextLine().toLowerCase();

            // Computer choice
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Decide winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a draw!");
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else if (
                userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")
            ) {
                System.out.println("You lose!");
            } else {
                System.out.println("⚠ Invalid choice. Please type rock, paper, or scissors.");
            }

            // Play again?
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

