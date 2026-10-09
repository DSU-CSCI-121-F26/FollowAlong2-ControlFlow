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
//a public class called IfStatements
public class IfStatements {
    //the main method where the program runs
    public static void main(String[] args) {
        //creates an int variable that is 75
        int age = 19;
        //checks if age is exactly equal to 75
        if (age == 75) {
            //prints "Ok Boomer"
            System.out.println("OK boomer!");
            //Runs if the first if is fale and age is greather than or equal to 19
        } else if (age >= 19) {
            //prints you are a teenager!
        System.out.println("You are an adult!");
        }
        //Runs if the first if is fale and age is greather than or equal to 19
        else if (age >= 13) {
            //prints
            System.out.println("You are a teenager!");
        //if no conditions match the response prints "You are not an adult"
        } else {
            System.out.println("You are not an adult!");
        }

    }



}
