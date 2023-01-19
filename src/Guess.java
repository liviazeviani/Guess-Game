import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guessNumber = (int)(Math.random()* 101);
        int theNumber = 0;

        while(guessNumber != theNumber){
            System.out.println("Please, guess the number i'm thinking (it is between 0 to 100)" +
                    ": ");
            theNumber = scanner.nextInt();

            if(theNumber > guessNumber)
                System.out.println("Humm, " + theNumber + " is too high, Try again: ");
            else if(theNumber < guessNumber)
                System.out.println("Humm, " + theNumber + " is too low, Try again: ");
            else
                System.out.println("Yay, " + guessNumber + " is the right number! ");
        }

    }
}