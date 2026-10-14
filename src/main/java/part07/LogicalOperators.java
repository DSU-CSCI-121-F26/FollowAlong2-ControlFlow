package part07;
import java.util.Scanner;

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

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // assigning the int temp and gives it the value 35
        int temp = 35;
        // first branch asking if the temp is more than 30 output this
        if (temp > 30) {
            System.out.println("It is hot outside!");
            // giving the 2nd branch and stating that if they are between 20 and 30 it is going to output this
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
            // outputting the default if the temp's value doesn't fall in any of those branches
        } else {
            System.out.println("It is cold outside!");
        }
        // giving the user instructions on what to do if you are trying to quit
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scnr.next();
        // Compares this string to the specified object and outputs based upon user response
        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
            // default branch of user input is not equivalent to q
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
        // as long as the user does not press q or Q the game keeps going
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
            // if the user presses q or Q the game quits
        } else {
            System.out.println("You quit the game");
        }

    }

}
