import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String playerChoice = scanner.nextLine();

        String computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
            (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
            (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You win! 🎉");
        } else {
            System.out.println("You lose! 😢");
        }

        scanner.close();
    }
}
