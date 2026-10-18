package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11–1:36:00 for the three parts of a for loop
// Guide: GUIDE.md in this folder, steps 2–5 and 8
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
/* My guess:
123

i is 5
i is 3
i is 1
*

correction:
1 2 3  - because when java adds the 1 to the space its like this "1 " there is a space in the string
i is 5 - no line because of the print statement in line 29
i is 3
i is 1
*** - inner loop runs 3 times
*** - out loop runs twice

 */
public class Stretch {
    public static void main(String[] args) {
        // B1
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

        // B1
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Liftoff!" );

        // B2
        for (int i = 2; i < 21; i += 2){
            System.out.println(i + " ");
        }

        // B3
        for (int row = 1; row < 6; row++){
            for (int col = 1 ; col < 6; col++){
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }

    }
}
