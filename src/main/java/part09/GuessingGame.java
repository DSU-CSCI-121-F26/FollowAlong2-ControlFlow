package part09;
// importing java.util.random and Scanner to be able to use their libraries
import java.util.Random;
import java.util.Scanner;
// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
// publicly accessed class called GuessingGame
public class GuessingGame {

    // the start of the program
    public static void main(String[] args) {

        // make scanner and random objects to be able to use them
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // pick a random number from 1 to 100 add + 1 so it includes the 1 and 100
        int randNum = random.nextInt(100) + 1;

        // make variables for the guess and the count
        int guess = 0;
        int count = 0;

        // prompt the user to pick a number for the game
        System.out.println("I'm thinking of a number between 1 and 100.");

        // loop while the guess is wrong:
        while (guess != randNum) {


            // ask for a guess
            System.out.print("Your guess: ");
            guess = scanner.nextInt();

            // count it
            count++;

            // if the guess is greater than the randNum
            if (guess > randNum) {
                // print Too high!
                System.out.println("Too high!");
                // else if the guess is less than the randNum
            } else if (guess < randNum) {
                // print Too low!
                System.out.println("Too low!");
            }
        }

        // say they got it, and how many guesses
        System.out.println("Correct! You got it in " + count + " guesses.");
        // closing scanner
        scanner.close();
        }
}

