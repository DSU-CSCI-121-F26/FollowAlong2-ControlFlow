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

        int temp = 25;  // Declares an integer variable named temp and sets its value to 25

        if (temp > 30) { // Checks if the temperature is strictly greater than 30
            System.out.println("It is hot outside!"); // Prints a message saying it is hot outside if the condition is true
        } else if (temp >= 20 &&  temp <= 30) { // Checks if the temperature is between 20 and 30 inclusive
            System.out.println("It is warm outside!");  // Prints a message saying it is warm outside if this condition is true
        } else { // Catches any remaining cases where the temperature is strictly less than 20
            System.out.println("It is cold outside!"); // Prints a message saying it is cold outside
        }

        Scanner scanner = new Scanner(System.in);// Creates a Scanner object to read input from the user
        System.out.println("You are playing a game! Press q or Q to quit");  // Prints instructions informing the user how to quit the game
        String response = scanner.next(); // Reads the next word entered by the user and stores it in the response variable
        if (response.equals("q") || response.equals("Q")) {  // Checks if the response string is equal to lowercase "q" or uppercase "Q"
            System.out.println("You quit the game");  // Checks if the response string is equal to lowercase "q" or uppercase "Q"
        } else {  // Executes if the user entered anything other than "q" or "Q"
            System.out.println("You are still playing the game *pew pew*");
            // Prints a message indicating that game play is continuing
        }

    }

}
