package part05;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        the hypotenuse project starts at about 61:29 — stop at about 63:52
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 05 — a project that uses the Math class: find the long side of a triangle
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Hypotenuse.
//    Leave the "package part05;" line and the "public class Hypotenuse" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Hypotenuse {
    public static void main(String[] args){
        // Declares a variable for side x
        double x;
        // Declares a variable for side y
        double y;
        // Declares a variable for the hypotenuse
        double z;
        // Creates a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        // Asks the user to enter side x
        System.out.println("Enter side x: ");
        // Reads the value of side x
        x = scanner.nextDouble();
        // Asks the user to enter side y
        System.out.println("Enter side y: ");
        // Reads the value of side y
        y = scanner.nextDouble();
        // Calculates the hypotenuse using the Pythagorean theorem
        z = Math.sqrt((x * x) + (y * y));
        // Displays the hypotenuse
        System.out.println(" The hypotenuse is: " + z);
        // Closes the Scanner
        scanner.close();
    }

}
