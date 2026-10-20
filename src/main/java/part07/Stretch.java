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
        int x = 7;
        System.out.println(x > 5 && x < 10);
        System.out.println(x > 5 && x > 10);
        System.out.println(x < 5 || x == 7);
        System.out.println(!(x == 7));
        int count = 3;
        while (count > 0) {
            System.out.println("count is " + count);
            count = count - 1;
        }
        System.out.println("done");
        /* My Guess
        true
        false
        true
        false

        count is 3
        count is 2
        count is 1
        done
         */
        // B1 count down
        int number = 5;
        while (number > 0) {
            System.out.println(number);
            number = number - 1;
        }
        System.out.println("Liftoff!");

        // B2
        Scanner scanner = new Scanner(System.in);
        String password = "java123";
        while (!scanner.nextLine().equals(password)) {
            System.out.print("Password: ");
        }   System.out.println("Access granted");

        //B3

        Scanner tab = new Scanner(System.in);
        int number1 = 0;

        while (number < 1 || number > 10) {
            System.out.print("Pick a number from 1 to 10: ");
            number = tab.nextInt();
        }


        }
    }


