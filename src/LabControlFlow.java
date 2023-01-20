import java.util.Scanner;

public class LabControlFlow {
    public static void main(String[] args) {
        // Create a simple number guessing game, that takes in some user input matches it to a 'secret' number.
        // Prompt user to enter numbers
        System.out.println("Try and Guess My Secret Number :D");
        System.out.println("The secret number is between 0 to 100");
        // Collect user input
        Scanner reader = new Scanner(System.in);
//        String secretNumber = reader.nextLine();
        // if the number is 22 print 'congratulations!'
//        String result = secretNumber.equals("22") ? "Congratulations!" : "Try Again!";
//        System.out.println(result);
        // otherwise print 'Try Again!'
        //
        // The program should indicate if an incorrect guess is too high or too low. It should, of course, let the user
        // know if they have guessed the number correctly.
        // code for too high
        // if true print 'too high'
        // code for too low
        // if true print 'too low'

        int secretNumber = reader.nextInt();
        if (secretNumber == 22) {
            System.out.println("Congratulations!");
        } else if (secretNumber >= 0 && secretNumber <= 21) {
            System.out.println("Too low, try again!");
        } else if (secretNumber >= 23 && secretNumber <= 100) {
            System.out.println("Too high, try again!");
        }
//
//    }
    }
}







