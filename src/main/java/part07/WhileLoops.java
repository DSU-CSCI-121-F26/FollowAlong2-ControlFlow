package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.

import java.util.Scanner;
// a public class template called WhileLoops
public class WhileLoops {
    //the main method whta mkes the program run
    public static void main(String[] args) {
        //creates a Scanner object so the user can input data
        Scanner scanner = new Scanner(System.in);
        //an empty string called name stores teh user name
        String name = "";



        do {//Starts a do while loop runs atleast once
            System.out.println("Enter your name:");//prints Enter ur name
            name = scanner.nextLine();//Read the entire line the user typed
        } while (name.isBlank());//loop again if the name is blank or just spaces
        System.out.println("Hello "+name);//Prints hello with the input of the users data
    }

}
