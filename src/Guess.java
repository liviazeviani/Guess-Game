import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guessNumber = (int)(Math.random()* 101);
        int theNumber = 0;
        System.out.println("Please, guess the number i'm thinking: ");
        theNumber = scanner.nextInt();
        System.out.println("Your number was: " + theNumber + ", and the right number is: " + guessNumber);

    }
}