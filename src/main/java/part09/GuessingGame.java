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

        // a string that is assigned to ask for the users name
        String userName;
        // what sets the guessing game number value that bounds between 1-100
        int randNum = rand.nextInt(100) + 1;
        // sets the assigned value for guesses to allow to count to grow after every iteration of the loop
        int guesses = 0;

        // asking for the user to input a name
        System.out.println("Hello what is your name?");
        // where the user will then enter the name
        userName = scnr.nextLine();
        // saying hi to whatever the user inputs
        System.out.println("Hello " + userName);
        // asking the user if they want to play the game and going based on what they click on the keyboard either Y/y or N/n
        System.out.println("Do you want to play a game? (Click Y or N)");
        // using the scanne to see what char they choose
        char userButton = scnr.next().charAt(0);
        // the if statement based upon what button they hit so if they click y it sends them into the game
        if (userButton == 'Y' || userButton == 'y') {
            // asking the user to choose a number which is the inital start if the game
            System.out.println("Pick a number between 1 - 100");
            // a new variable created to scan what integer value that the user inputs and reacting based off of that
            int userGuess = scnr.nextInt();
            // this adds one every time to the user guesses when they guess incorrectly or if they do
            guesses++;
            // a while loop to do that helps the user get a better guage on what the number is due to it being 1-100 and only runs while the
            // user number is not equal to the random number that is generated
            while (userGuess != randNum) {
                // an if statement that is built into the while loop to give the while loop its task
                if (userGuess > randNum) {
                    // souts go lower if the number is higher than the random number
                    System.out.println("Go Lower!");
                    // else statement that souts go higher if the user guess is less than the random number
                } else {
                    System.out.println("Go Higher!");
                }
                // this rescans and asks for the user to input another int value between 1-100 so they can guess again
                userGuess = scnr.nextInt();
                // adds 1 to the amount of guesses when wrong
                guesses++;
            }
            // this is outside the loop it happens once the user inputs the right value and breaks the loop letting the
            // user know that they are correct and outputs the amount of guesses it took them to get to the number
            System.out.println("Correct!\nGuesses:" + guesses);
        }
        // if the user says no it kills the program and tells them bye bye, based upon user char input if equal to N/n
        if (userButton == 'N' || userButton == 'n') {
            System.out.println("Bye Bye");
        }
    }
}







