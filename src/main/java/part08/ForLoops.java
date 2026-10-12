package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        starts at 1:32:37 — stop at about 1:36:20, before "if you would like a copy"
// Guide: GUIDE.md in this folder, steps 1–5
//
// Part 08 — for loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ForLoops {
    public static void main(String[] args) {
        // decleration of the for loop with reads until the end based upon the set amount iterations told to do so 10 times starting from 0 going up 1 time until being 10
        for (int i = 0; i <= 10; i++) {
            // outputting 0,1,2,3,4... from the given loop
            System.out.println(i);
        }
        // same as above starting from 10 and counting down to 0 and subtracting 1 everytime the loop is called upon until broken
        for (int i = 10; i >= 0; i--) {
            // the output which will be 10,9,8,7,6... until reaching 0
            System.out.println(i);
        }
        // once the loop hits zero it breaks, and then it reads the next line outside of it and outputs happy new years
        System.out.println("Happy New Year!");
        // same as above but this time taking away 2 away every time from 10
        for (int i = 10; i >= 0; i -= 2) {
            // output will be 10,8,6,4,2,0
            System.out.println(i);
        }
        // the loop will break once it hits zero and read the next line and output happy new years
        System.out.println("Happy New Years!");



    }

}
