import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempts = 0;
        int min = 0;
        int max = 100;
        int randomNumber = random.nextInt(min, max+1);
        System.out.println("Number Guessing game");
        System.out.printf("Guess a number between %d and %d", min, max);
        do{
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts ++;
            if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again.");
            }else if (guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }else if( guess == randomNumber){
                System.out.println("Your guess is correct! The number was "+ randomNumber);
            }
        } while(guess != randomNumber);



    }
}
