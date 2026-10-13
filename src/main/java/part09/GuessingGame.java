package part09;
import java.util.Scanner;
import java.util.Random;

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

public class GuessingGame {
    /*
    I am going to ask for the name of the person after that I am
    going to ask if they want to play a little game I made giving them
    the char options of Y/y and N/n if the click N/n it outputs bye bye
    and kills the game. if yes is pressed the game is bounded to only 50
    and there will be a count displayed until once the userGuess == randNum;
     */

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);


        String userName;
        int randNum = rand.nextInt(100) + 1;
        int guesses = 0;


        System.out.println("Hello what is your name?");
        userName = scnr.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("Do you want to play a game? (Click Y or N)");
        char userButton = scnr.next().charAt(0);

        if (userButton == 'Y' || userButton == 'y') {
            System.out.println("Pick a number between 1 - 100");
            int userGuess = scnr.nextInt();
            guesses++;

            while (userGuess != randNum) {
                if (userGuess > randNum) {
                    System.out.println("Go Lower!");
                } else {
                    System.out.println("Go Higher!");
                }
                userGuess = scnr.nextInt();
                guesses++;
            }

            System.out.println("Correct!\nGuesses:" + guesses);
        }

        if (userButton == 'N' || userButton == 'n') {
            System.out.println("Bye Bye");
        }
    }
}







