package part07;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.

public class WhileLoops {
    public static void main(String[] args) {
        // initializing the scanner
        Scanner scnr = new Scanner(System.in);
        // assigning the String with a blank so its up to user input
        String name = "";
        // a while loop and having the loop read the string and to see if it is blank
        // if it is blank it asks for the users name until the input is no longer blank
        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scnr.nextLine();
        }
        // outputs hello with the user inputted name
        System.out.println("Hello " + name );
        // so like do means that must you execute first at least once before the loop's continuation
        do {
            // asking for user name
            System.out.println("Enter your name: ");
            // the scanner that gets the user name
            name = scnr.nextLine();
            // and this is telling the loop to either keep running off the basis if there is no user input until there is a value entered by the user
        } while (name.isBlank());

    }

}
