package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        starts at about 35:40 — stop at about 38:50, at "your assignment for today"
// Guide: GUIDE.md in this folder, steps 1–4
//
// Part 03, topic 1 — swapping two variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Swap.
//    Leave the "package part03;" line and the "public class Swap" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Swap {
    public static void main(String[] args){
        // Creates a String variable x and stores "water".
        String x = "water";
        // Creates a String variable y and stores "Kool-Aid".
        String y = "Kool-Aid";
        // Prints the current value of x.
        System.out.println("x: "+ x);
        // Prints the current value of y.
        System.out.println("y: "+ y);
        // Declares a temporary String variable to help swap the values.
        String temp;
        // Saves the value of x ("water") in temp.
        temp = x;
        // Assigns the value of y ("Kool-Aid") to x.
        x = y;
        // Assigns the original value of x ("water") to y.
        y = temp;
        // Prints the new value of x, which is "Kool-Aid".
        System.out.println("x: "+ x);
        // Prints the new value of y, which is "water".
        System.out.println("y: "+ y);

    }

}


