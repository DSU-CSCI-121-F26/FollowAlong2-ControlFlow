package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

// Declares a public class named IfStatements; the file must be named IfStatements.java
public class IfStatements {
    // Entry point: the JVM starts running the program here
    public static void main(String[] args) {
        // Declares an int variable named age and assigns it the value 75
        int age = 75;
        // Runs the block below only if age equals exactly 75
        if (age == 75) {
            // Prints "OK boomer!"
            System.out.println("OK boomer!");
            // Checked only if the first condition was false: runs if age is 18 or greater
        } else if (age >= 18) {
            // Prints "You are an adult!"
            System.out.println("You are an adult!");
            // Checked only if all earlier conditions were false: runs if age is 13 or greater
        } else if (age >= 13) {
            // Prints "You are a teenager!"
            System.out.println("You are a teenager!");
            // Runs when none of the conditions above were true (age is below 13)
        } else {
            // Prints "You are not an adult!"
            System.out.println("You are not an adult!");
        }
    }
}


