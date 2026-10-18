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

// publicly accessed class called NestedLoops
public class NestedLoops {
    // the start of the program
    public static void main(String[] args) {
        // initialization of the scanner object
        Scanner scanner = new Scanner(System.in);

        // declares an int row
        int rows;
        // declares an int columns
        int columns;
        // declares a string symbol and assigns to empty quotes
        String symbol = "";

        //prints "Enter number of rows:"
        System.out.println("Enter number of rows: ");
        // reassigns rows to what number the scanner has that the user types
        rows = scanner.nextInt();
        //prints "Enter number of columns:"
        System.out.println("Enter number of columns: ");
        // reassigns columns to what number the scanner has that the user types
        columns = scanner.nextInt();
        // prints "Enter symbol to use: "
        System.out.println("Enter symbol to use: ");
        // reassigns symbol to what phrase the scanner has that the user types
        symbol = scanner.next();

        // for loop that runs for as long as i is less than rows and everytime the loop ends it increments i
        for (int i = 1; i <= rows; i++) {
            //prints nothing
            System.out.println();
            // for loop that runs for as long as j is less than columns and everytime the loop ends it increments j
            for (int j = 1; j <= columns; j++) {
                // prints the symbol
                System.out.print(symbol);
            }
        }
    }

}
