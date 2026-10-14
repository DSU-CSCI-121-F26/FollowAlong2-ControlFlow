package part08;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class NestedLoops {
    public static void main(String[] args) {
        // the scanner initalizing it into the system
        Scanner scnr = new Scanner(System.in);
        // setting and assginign an integer with the name rows
        int rows;
        // setting and assigning another integer with the name columns
        int columns;
        // a string value called symbol with a blank as its assigned variable
        String symbol = "";
        // asking the user to enter amount of rows they want
        System.out.println("Enter number of rows:");
        // scanning for the user input and storing that value and setting it for the int
        rows = scnr.nextInt();
        // asking the user how many columns they want
        System.out.println("Enter number of columns:");
        // scanning for the user input and storing that value and setting it for the int
        columns = scnr.nextInt();
        // asking the user what symbol they want to use
        System.out.println("Enter symbol to use:");
        // scanning for the user input and storing that value and setting it for the int
        symbol = scnr.next();
        // a for loop to run the user program and having it scale based of the users values entered
        for (int i = 1; i <= rows; i++) {
            // printing a new line
            System.out.println();
            // has to all be under the same loop for the code to work and the loop reads until the maximum
            // amount of columns that the user set
            for (int j = 1; j <= columns; j++) {
                // printing out the symbol in the table based off of the rows and columns input
                System.out.println(symbol);
            }
        }


    }

}
