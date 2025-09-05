import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class game {
    public static void main(String[] args) {
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String userChoice = "";
        String computerChoice = choices[random.nextInt(3)];

        // Read from input.txt
        try {
            File file = new File("input.txt");
            if (file.exists()) {
                Scanner fileScanner = new Scanner(file);
                if (fileScanner.hasNextLine()) {
                    userChoice = fileScanner.nextLine().trim().toLowerCase(); // trim spaces
                    System.out.println("User choice (from file): " + userChoice);
                }
                fileScanner.close();
            } else {
                System.out.println("⚠ input.txt not found. Using default choice 'rock'.");
                userChoice = "rock";
            }
        } catch (FileNotFoundException e) {
            System.out.println("⚠ input.txt not found. Using default choice 'rock'.");
            userChoice = "rock";
        }

        System.out.println("Computer chose: " + computerChoice);

        // Determine winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a draw!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("✅ You win!");
        } else if (
            userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")
        ) {
            System.out.println("❌ You lose!");
        } else {
            System.out.println("⚠ Invalid choice in input.txt! Using default 'rock'.");
        }
    }
}



