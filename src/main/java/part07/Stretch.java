package part07;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        rewatch 81:35–87:47 for && || !, 89:29–91:54 for while
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// If your program never stops: click the red square (Stop) in the Run window.

public class Stretch {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int x = 7;

        System.out.println(x > 5 && x < 10);
        System.out.println(x > 5 && x > 10);
        System.out.println(x < 5 || x == 7);
        System.out.println(!(x == 7));

        int count = 3;

        while (count > 0) {
            System.out.println("count is " + count);
            count--;
        }
        System.out.println("done");

        /*
        the while loop is going to keep reiterating until the count value is 0 and then
        the loop is going to break and output done. with the ones above i think its goins
        to output true or false, or its going to just sout line if it is true but i
        geniuenly can not remember
         */
        // got it right

        int clock = 5;

        while (count > 0) {
            System.out.println(clock);
            clock--;
        }
        System.out.println("Liftoff!");

        String password = "";

        while (password.equals("")) {
            System.out.print("Password: ");
            password = scnr.next();
        }
        System.out.println("Access Granted");

        int userNum = 0;

        while (userNum < 1 || userNum > 10) {
            System.out.println("Pick a number from 1 to 10: ");
            userNum = scnr.nextInt();
        }
        System.out.println("You picked " + userNum);


    }

}
