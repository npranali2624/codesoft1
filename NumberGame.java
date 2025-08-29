package CODSOFT.Task1_numberGame;
import java.util.Scanner;
import java.util.Random;

public class NumberGame 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int totalGames = 0;
        int totalWins = 0;
        String again;

        do 
        {
            int secretNumber = random.nextInt(100) + 1;
            int tries = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI'm thinking of a number between 1 and 100.");
            System.out.println("You have 5 tries to guess it!");

            while (tries < 5) 
            {
                System.out.print("Your guess: ");
                int userGuess = input.nextInt();
                tries++;

                if (userGuess == secretNumber) 
                {
                    System.out.println("Correct! You win!");
                    guessedCorrectly = true;
                    totalWins++;
                    break;
                } 
                else if (userGuess < secretNumber) 
                {
                    System.out.println("Too low.");
                } 
                else 
                {
                    System.out.println("Too high.");
                }
            }

            if (!guessedCorrectly) 
            {
                System.out.println("Sorry, the number was: " + secretNumber);
            }

            totalGames++;
            System.out.print("Do you want to play again? (yes/no): ");
            again = input.next();
        } while (again.equalsIgnoreCase("yes"));

        System.out.println("\nYou played " + totalGames + " times and won " + totalWins + " times.");
        input.close();
    }
}
