package arrayProblems;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(10)+1;
        int guess = 0;

        Scanner scanner = new Scanner(System.in);
        System.err.println("Ready to guess the number");
        System.out.println("Think number btw 1 to 100");

        while(true){
            System.err.println("Enter the number: ");
            int guessedNumber = scanner.nextInt();
            guess++;
            if (guessedNumber == numberToGuess){
                System.out.println("Great! you guessed the correct number");
                System.err.println("Attempt "+guess);
            } else if (guessedNumber > numberToGuess) {
                System.out.println("You have guessed large number!!");
                System.err.println("Attempt "+guess);
            } else{
                System.out.println("You have guessed less number!!");
                System.err.println("Attempt "+guess);
            }
        }
    }
}
