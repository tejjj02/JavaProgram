import java.util.Random;
import java.util.Scanner;
public class numberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int attempts = 0;
        int score = 0;
        boolean play= true;
        while (play) {
            int generatedNumber = random.nextInt(max - min + 1) + min;
            System.out.print("Guess a number between " + min + " and " + max + ":"+"\n");
            
            boolean guessedCorrectly = false;
            while (!guessedCorrectly) {
                int userGuess = sc.nextInt();
                attempts++;
                
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guess was correct.");
                    guessedCorrectly = true;
                    score++;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }
            
            System.out.println("Attempts: " + attempts);
            System.out.println("Score: " + score);
            
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainInput = sc.next();
            if (playAgainInput.equalsIgnoreCase("no")) {
                play = false;
            }
            
            attempts = 0;
        }
        
        System.out.println("Thank you for playing!");
        sc.close();
    }
}
