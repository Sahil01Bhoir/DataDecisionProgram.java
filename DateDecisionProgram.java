
import java.util.Random;
import java.util.Scanner;

public class DateDecisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Date Decision Program!");
        System.out.print("Enter your name: ");
        String yourName = scanner.nextLine();

        System.out.print("Enter the other person's name: ");
        String otherPersonName = scanner.nextLine();

        System.out.println("\nGenerating a floating-point number...");

        // Generate a random floating-point number between 0 and 1
        double randomNumber = new Random().nextDouble();

        System.out.println("Generated Number: " + randomNumber);

        // Decide whether to go on a date based on the random number
        boolean shouldGoOnDate = randomNumber <= 0.8;

        // Output the decision
        System.out.println("\nDecision:");

        if (shouldGoOnDate) {
            System.out.println("Congratulations, " + yourName + " and " + otherPersonName + "! You should go on a date!");
        } else {
            System.out.println("Sorry, " + yourName + " and " + otherPersonName + ". Maybe next time!");
        }
    }
}