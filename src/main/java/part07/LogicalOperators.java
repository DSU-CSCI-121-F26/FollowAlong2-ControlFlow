package part07;
import java.util.Scanner;
// import the necessary libraries to use the scanner

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// Declares a public class named LogicalOperators;

public class LogicalOperators {
        // start of the program
        public static void main(String[] args) {
            // Declares an int variable named temp and assigns it the value 25
            int temp = 25;
            // Runs the block below only if temp is greater then 30
            if (temp > 30) {
                // Prints "It is hot outside!"
                System.out.println("It is hot outside!");
             // Runs the block below only if temp is greater than or equal to 20 and temp is less than or equal to 30
            } else if (temp >= 20 && temp <= 30) {
                // prints It is warm outside!
                System.out.println("It is warm outside!");
                // Runs when none of the conditions above were true (age is below 13)
            } else {
                // prints It is cold outside!
                System.out.println("It is cold outside!");
            }
            // makes a new object of the class scanner called scanner
            Scanner scanner = new Scanner(System.in);
            // prints "You are playing a game! Press q or Q to quit"
            System.out.println("You are playing a game! Press q or Q to quit");
            // initializes a String object called response
            String response = scanner.next();
            // if the response does not equal 'q' and the response doesn't equal 'Q' the if statement runs
            if (!response.equals("q") && !response.equals("Q")) {
                // this prints "You are still playing the game *pew pew*"
                System.out.println("You are still playing the game *pew pew*");
                // the start of the else statement
            } else {
                // prints "You quit the game"
                System.out.println("You quit the game");
            }
        }
    }


