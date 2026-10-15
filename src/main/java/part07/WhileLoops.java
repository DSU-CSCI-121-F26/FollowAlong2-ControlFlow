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
// publicly accessed class called WhileLoops
public class WhileLoops {
    // the start of the program
    public static void main(String[] args) {
        // making the scanner object
        Scanner scanner = new Scanner(System.in);
        // makes a string variable named name which is assigned to empty quotes
        String name = "";
        // start of the do this code while this condition lasts
        do {
            // prints "Enter your name: "
            System.out.print("Enter your name: ");
            // saving the name in a variable obtained by the scanner
            name = scanner.nextLine();
            // while the name is blank the loop will continue to run
        } while (name.isBlank());
        // prints "Hello with the name given to the scanner
        System.out.println("Hello " + name);
    }
}
