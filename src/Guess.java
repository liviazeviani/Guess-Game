import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            int theNumber = (int) (Math.random() * 101);
            int guessNumber = 0;

            while (theNumber != guessNumber) {
                System.out.println("Please, guess the number i'm thinking (it is between 0 to 100)" +
                        ": ");
                guessNumber = scanner.nextInt();

                if (guessNumber > theNumber)
                    System.out.println("Humm, " + guessNumber + " is too high, Try again: ");
                else if (guessNumber < theNumber)
                    System.out.println("Humm, " + guessNumber + " is too low, Try again: ");
                else
                    System.out.println("Yay, " + theNumber + " is the right number! ");
            }
            System.out.println("Do you wanna play again? (y/n): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Allright! It was a good game. Bye!");
        scanner.close();

    }
}