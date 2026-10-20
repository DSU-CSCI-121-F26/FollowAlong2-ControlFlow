package part06;
import java.util.Scanner;
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

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // Creates a new Scanner object named age1 to listen for user input from the console
        Scanner age1 = new Scanner(System.in);
        // Reads the next integer typed by the user and saves it in an integer variable named age
        int age = age1.nextInt();
        // Checks if the entered age is exactly equal to 75
        if (age == 75) {
            // Prints "OK boomer!" to the console if the age is 75
            System.out.println("OK boomer!");
            // Checks if the age is 18 or older (when age is not 75)
        } else if (age >= 18) {
            // Prints "You are an adult!" to the console if the age is 18 or older
            System.out.println("You are an adult!");
            // Checks if the age is 13 or older (when age is less than 18)
        }   else if (age >= 13) {
            // Prints "You are a teenager!" to the console if the age is between 13 and 17
            System.out.println("You are a teenager!");
            // Catches any remaining cases (when age is less than 13)
        }           else {
            // Prints "You dont exist!" to the console for any age under 13
            System.out.println("You dont exist!");
        }
    }


}
