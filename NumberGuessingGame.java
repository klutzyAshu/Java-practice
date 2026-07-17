import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        // Generates a number between 1 and 100
        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange; 
        
        int attempts = 0;
        int userGuess = 0;
        boolean hasWon = false;

        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");
        System.out.println("Try to guess it!");
        System.out.println("--------------------------------------------");

        // Game loop
        while (!hasWon) {
            System.out.print("Enter your guess: ");
            
            // Validate input to ensure it's an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid valid number.");
                scanner.next(); // Clear the invalid input
                continue;
            }
            
            userGuess = scanner.nextInt();
            attempts++;

            // Check the guess
            if (userGuess < minRange || userGuess > maxRange) {
                System.out.println("Out of bounds! Stay between " + minRange + " and " + maxRange + ".");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! ⬆️ Try a higher number.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! ⬇️ Try a lower number.");
            } else {
                hasWon = true;
                System.out.println("\n🎉 Congratulations! You guessed the correct number!");
                System.out.println("It took you " + attempts + " attempts.");
            }
            System.out.println("--------------------------------------------");
        }

        scanner.close();
    }
}