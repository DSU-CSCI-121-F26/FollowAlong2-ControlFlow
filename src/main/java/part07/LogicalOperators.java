package part07;

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

import java.util.Scanner;
//A public class called Logical Operators
public class LogicalOperators {
    //The main method the program starts running there
    public static void main(String[] args) {
        //an int variable called temp that stores 25
        int temp = 25;

        //Checks if temp is greater than 30
        if (temp > 30) {
            //prints It is hot outside
            System.out.println("It is hot outside!");
            //checks if temp is less than or equal to 20 and temp is less than or equal to 30
        } else if (temp >= 20 && temp <= 30) {
            //prints It is warm outside
            System.out.println("It is warm outside!");
            //runs only if any other condition isnt true
        } else {
            //prints It is cold outside!
            System.out.println("It is cold outside!");
        }
        //Creates a Scanner object so that the user can read user input
        Scanner scanner = new Scanner(System.in);
        //prints instructiosn for the player
        System.out.println("You are playing a game! Press q or Q to quit");
        //reads the next words the user types and stores it into response
        String response = scanner.next();


        if (!response.equals("q") && !response.equals("Q")) {
            //! means not so if the user response is not equal to q and not equal to Q you quit the game
            System.out.println("You quit the game");
            //if the user did type q or Q it runs
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
    }
}
