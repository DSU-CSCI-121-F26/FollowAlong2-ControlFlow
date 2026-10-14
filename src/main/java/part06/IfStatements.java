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

public class IfStatements {
    public static void main(String[] args) {
        // declaring and assigning the int age with whatever I decide
        int age = 5;
        // first branch of the if statement saying if you are set age or older you are this
        if (age >= 75) {
            System.out.println("OK boomer!");
        // providing a second branch saying if you are less than the 1 above and more than or equal to 18 you are this
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        // providing the 3rd branch stating if you are 1 less than the 2nd branch and also older than or equal to 13 you are this
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        // basically if you are in none of these categories you default to this
        } else {
            System.out.println("You are not an adult!");
        }

    }

}
