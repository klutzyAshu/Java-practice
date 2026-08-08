import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PipedWriter;
// number guessing game  with data records of the player.

public class NumberGuessingGame {

    // function1
    private static final String path= "/home/ashu/Documents/Java-practice/database/leaderboard.csv";
    private static String playerName(Scanner scanner){
        System.out.println("Wellcome to Number Guessing game :");
        System.out.println("Enter ur name pal");
        String name = scanner.nextLine().trim();
        return name.isEmpty() ? " Stranger" : name;



    }


    private static int playGame(Scanner scanner String playerName){
        

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("🎉 Welcome to the Number Guessing Game! 🎉");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?");

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
