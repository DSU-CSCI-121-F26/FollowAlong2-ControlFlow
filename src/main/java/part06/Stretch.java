package part06;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4161s
//        rewatch 69:21–74:54 for if / else if / else, 76:36–80:18 for switch
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        Scanner age1 = new Scanner(System.in);

            int age = age1.nextInt();
        if (age == 75) {
            System.out.println("OK boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        }   else if (age >= 13) {
        System.out.println("You are a teenager!");
        }           else {
            System.out.println("You dont exist!");
        }
    }

}
