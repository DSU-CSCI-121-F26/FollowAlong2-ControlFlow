package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

//A public class called Switches
public class Switches {
    //The main method where the program starts running
    public static void main(String[] args) {
        //creates a string variable named day stores "Mondy"
        String day = "Mondy";

        //A switch statement that checks the value of the variable day
        switch (day) {
            //If day equals sunday it breaks here
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            //breaks the switch so it doesnt fall through

            //If day equals sunday it breaks here
            case "Monday":
                System.out.println("It is Monday");
                break;
            //breaks the switch so it doesnt fall through

            //If day equals Tuesday it breaks here
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            //breaks the switch so it doesnt fall through

            //If day equals Wednesday it breaks here
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            //breaks the switch so it doesnt fall through

            //If day equals Thursday it breaks here
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            //breaks the switch so it doesnt fall through

            //If day equals Friday it breaks here
            case "Friday":
                System.out.println("It is a Friday");
                break;
            //breaks the switch so it doesnt fall through

            //runs if none of the above cases match
            default:
                System.out.println(day+" is not a day");
                //prints the value of the day and says its not a valid day
        }
    }
}
