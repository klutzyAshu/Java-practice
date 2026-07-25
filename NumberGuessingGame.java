import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("🎉 Welcome to the Number Guessing Game! 🎉");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?");

        // Loop until the user guesses correctly
        while (!guessedCorrectly) {
            System.out.print("\nEnter your guess (or type 'quit' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing! See you next time!");
                break;
            }

            try {
                guess = Integer.parseInt(input);
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    guessedCorrectly = true;
                    System.out.println("🎉 Congratulations! You guessed it!");
                    System.out.println("It took you " + attempts + " attempts. Well done!");
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number or 'quit'.");
            }
        }

        scanner.close();
    }
}
