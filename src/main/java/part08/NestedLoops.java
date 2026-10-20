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
        // Creates a Scanner object to read input from the console (keyboard)
        Scanner scanner = new Scanner(System.in);

        int rows = 10;  // Declares an integer variable for rows and initializes default value to 10
        int columns = 17; // Declares an integer variable for columns and initializes default value to 17
        String symbol = "";  // Declares a String variable to store the symbol character, initialized empty

        System.out.println("Enter number of rows:");  // Prints a message asking the user to enter the number of rows
        rows = scanner.nextInt();// Reads the integer input from the user and stores it in 'rows'
        System.out.println("Enter number of columns:"); // Prints a message asking the user to enter the number of columns
        columns = scanner.nextInt(); // Reads the integer input from the user and stores it in 'columns'
        System.out.println("Enter symbol to use:"); // Prints a message asking the user to enter the symbol character to display
        symbol = scanner.next(); // Reads the next word/character input from the user and stores it in 'symbol'

        // Outer loop that runs 'rows' times to create each new row
        for (int i = 1; i <= rows; i++) {
            System.out.println(); // Prints a blank new line for each row iteration
        }// Closes the first for loop
        for (int i = 1; i <= rows; i++) {// Closes the first for loop
            System.out.println();// Moves the cursor to a new line before printing symbols for the row
            for (int j = 1; j <= columns; j++) { // Inner loop running from 1 up to 'columns' to print symbols across a row
                System.out.print(symbol);// Prints the chosen symbol without adding a new line (keeps printing side-by-side)
            }
        }
    }

}
