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
        Scanner age1 = new Scanner(System.in);

        int age = age1.nextInt();
        if (age == 75) {
            System.out.println("OK boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        }   else if (age >= 13) {
            System.out.println("You are a teenager!");
        }           else {
            System.out.println("You dont exist!");
        }
    }


}
