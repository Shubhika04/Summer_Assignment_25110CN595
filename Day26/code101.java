import java.util.Random;
import java.util.Scanner;

public class code101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random randomNum = new Random();

        int min = 1;
        int max = 100;

        int secretNumber = randomNum.nextInt(max - min + 1) + min;

        int guess = 0;
        int attempts = 0;
        int maxAttempts = 8;
        int score = 100;

        System.out.println("=================================");
        System.out.println("       NUMBER GUESSING GAME");
        System.out.println("=================================");

        System.out.println("INSTRUCTIONS:");
        System.out.println("Guess a number between " + min + " and " + max + " (inclusive)");
        System.out.println("2. You have only " + maxAttempts + " attempts");
        System.out.println("3. Score decreases with each wrong attempt");

        do {
            if (attempts == maxAttempts) {
                System.out.println("\nGame Over! You have used all attempts.");
                break;
            }

            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();

            if (guess < min || guess > max) {
                System.out.println("Please enter a number between " + min + " and " + max + "(min and max are included).");
                continue;
            }

            attempts++;

            if (guess > secretNumber) {
                score -= 10; 
                System.out.println("Too High!");
            }
            else if (guess < secretNumber) {
                score -= 10; 
                System.out.println("Too Low!");
            }
            else {
                System.out.println("\nCongratulations!");
                System.out.println("You have guessed the correct number!");
                System.out.println("The Secret Number is " + secretNumber);
                break;
            }

            System.out.println("Your Current Score: " + score);
            System.out.println("Remaining Attempts: " + (maxAttempts - attempts));

        } while (guess != secretNumber);

        // RESULT SECTION
        System.out.println("\n===============================");
        System.out.println("            RESULT");
        System.out.println("===============================");

        if (guess == secretNumber) {
            System.out.println("Your Status: WINNER");
        }
        else {
            System.out.println("Your Status: LOST");
        }

        System.out.println("The Secret Number is " + secretNumber);
        System.out.println("Total Attempts Used: " + attempts);

        if (score < 0) {
            score = 0;
        }

        System.out.println("Your Final Score: " + score + " / 100");

        System.out.println("=================================");
        System.out.println("Thank you for playing!");
        System.out.println("Hope You Have Enjoyed The Game!");
        System.out.println("=================================");

        sc.close();
    }
}