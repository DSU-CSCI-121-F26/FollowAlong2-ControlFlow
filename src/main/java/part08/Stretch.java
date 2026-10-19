package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11–1:36:00 for the three parts of a for loop
// Guide: GUIDE.md in this folder, steps 2–5 and 8
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 5; i > 0; i -= 2) {
            System.out.println("i is " + i);
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /* My Guess
        1 2 3
        i is 5
        i is 3
        i is 1
        1
        2
        3
        ***
        **** I guessed wrong cai thought it was counting above 3 stars instead of thinking about it as 1,2,3
         */
        for (int k = 5; k >= 1; k--) {
            System.out.println(k);
        }
        System.out.println("Liftoff!");

        for (int v = 2; v <= 20; v += 2) {
            System.out.print(v + " ");
            System.out.println();
        }

            for (int m = 0; m <= 5; m++) {
                for ( int n = 1; n <= 5; n++) {
                   System.out.print((m * n) + "\t");
                }
                System.out.println();
        }
    }
}
