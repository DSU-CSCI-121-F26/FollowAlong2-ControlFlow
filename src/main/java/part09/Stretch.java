package part09;
import java.util.Scanner;
import java.util.Random;

// Part 09 — CHECKPOINT. No video in this part.
// Reminders: while loops — part 07 · Scanner — part 03 · Random — part 05
// Video (only if you need it): https://www.youtube.com/watch?v=xk4_1vDrzzo
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

import java.util.Random;
import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        int count = 0;
        int n = 1;
        while (n < 20) {
            n = n * 2;
            count++;
        }
        System.out.println(n + " " + count);

        int x = 7;
        while (x > 0) {
            if (x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
            x -= 3;
        }

        /*
        the first sout is going to output 32 and the count is either going to be 4 or 5.
        the 2nd loop is going to idk i forgot low key i know though the modules is 1 so
        it might output the else statement I can not remember.
         */
        // was right on the first one and on the 2nd one wrong


        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += 10;
            i++;
        }
        System.out.println("Sum: " + sum);

        int userNum = 0;
        System.out.println("Pick a number from 1 to 10: ");
        userNum = scnr.nextInt();
        while (userNum > 10 || userNum < 1) {
            System.out.println("Pick a number from 1 to 10: ");
            userNum = scnr.nextInt();
        }
        System.out.println("Thanks! You picked " + userNum);

        int dice = rand.nextInt(6) + 1;
        int rolls = 1;
        while (dice != 6) {
            dice = rand.nextInt(6) + 1;
            rolls++;
        }
        System.out.println("It took " + rolls + " rolls to get a 6.");

    }


}
