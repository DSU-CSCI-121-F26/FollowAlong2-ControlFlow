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
        /*
        true
        false
        true
        false
        count is 3
        count is 2
        count is 1
        done
         */
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

        // B1
        int countt = 5;

        while (countt > 0) {
            System.out.println(countt);
            countt = countt - 1;
        }
        System.out.println("Liftoff!");


        //B2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password: ");
        String password = scanner.next();

        while (!password.equals("java123")) {
            System.out.println("Password: ");
            password = scanner.next();
            scanner.nextLine();
        }
        System.out.println("Access granted");

        //B3
        System.out.println("Pick a number from 1 to 10: ");
        int num2 = 0;

        while (num2 < 1 || num2 > 10) {
            System.out.println("Pick a number from 1 to 10: ");
            num2 = scanner.nextInt();
        }

            System.out.println("you picked " + num2);

            scanner.close();

        }

}
