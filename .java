import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 10;
        boolean hasWon = false;
        
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts");
        
        while(attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if(guess == numberToGuess) {
                hasWon = true;
                break;
            } else if(guess < numberToGuess) {
                System.out.println("Too low! Attempts left: " + (maxAttempts - attempts));
            } else {
                System.out.println("Too high! Attempts left: " + (maxAttempts - attempts));
            }
        }
        
        if(hasWon) {
            System.out.println("Congratulations! You won in " + attempts + " attempts!");
        } else {
            System.out.println("Game over! The number was: " + numberToGuess);
        }
        
        scanner.close();
    }
}
