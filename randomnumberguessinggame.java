import java.util.Scanner;

public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = (int)(Math.random() * 100) + 1;
        int maxAttempts = 5;
        int remainingAttempts = maxAttempts;

        System.out.println("Welcome to the Random Number Guessing Game!");
        System.out.println("I've selected a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("The number is greater than " + userGuess);
            } else {
                System.out.println("The number is less than " + userGuess);
            }

            remainingAttempts--;

            if (remainingAttempts > 0) {
                System.out.println("You have " + remainingAttempts + " attempts remaining.");
            } else {
                System.out.println("Out of attempts! The secret number was: " + numberToGuess);
            }
        }

        System.out.println("Thank you for playing the Random Number Guessing Game!");
        scanner.close();
    }
}
