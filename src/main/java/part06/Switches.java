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
// Declares a public class named Switches; the file must be named Switches.java
public class Switches {
    // Entry point: the JVM starts running the program here
    public static void main(String[] args) {
        // Declares a String variable named day and assigns it the value "Pizza"
        String day = "Pizza";
        // Starts a switch statement that compares the value of day against each case label
        switch (day) {
            // Runs the code below if day equals "Sunday" (case-sensitive match)
            case "Sunday":
                // Prints "It is Sunday"
                System.out.println("It is Sunday");
                // Exits the switch and continues with any code after it
                break;
            // Runs the code below if day equals "Monday"
            case "Monday":
                // Prints "It is Monday"
                System.out.println("It is Monday");
                // Exits the switch
                break;
            // Runs the code below if day equals "Tuesday"
            case "Tuesday":
                // Prints "It is Tuesday"
                System.out.println("It is Tuesday");
                // Exits the switch
                break;
            // Runs the code below if day equals "Wednesday"
            case "Wednesday":
                // Prints "It is Wednesday"
                System.out.println("It is Wednesday");
                // Exits the switch
                break;
            // Runs the code below if day equals "Thursday"
            case "Thursday":
                // Prints "It is Thursday"
                System.out.println("It is Thursday");
                // Exits the switch
                break;
            // Runs the code below if day equals "Friday"
            case "Friday":
                // Prints "It is Friday"
                System.out.println("It is Friday");
                // Exits the switch
                break;
            // Runs the code below if day equals "Saturday"
            case "Saturday":
                // Prints "It is Saturday"
                System.out.println("It is Saturday");
                // Exits the switch
                break;
            // Runs when no case label matches day; with "Pizza" this is the branch that executes
            default:
                // Prints the value of day followed by " is not a day"
                System.out.println(day + " is not a day");
        }
    }

}
