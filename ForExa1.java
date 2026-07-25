import java.util.Scanner;

public class ForExa1 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 100) + 1; 
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Guess any number between 1 and 100:");
            int b = sc.nextInt();

            if (a == b) {
                System.out.println("You entered the correct number!");
                break;
            } else if (b < a) {
                System.out.println("Too low! Try again hahahahahahahahahahahahahhahahah.");
            } else {
                System.out.println("Too high! Try again.hahahahahahahahahahahahahahahahahahah");
            }
        }

        sc.close();
    }
}