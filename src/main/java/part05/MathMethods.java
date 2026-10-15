package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class MathMethods {
    public static void main(String[] args){
        // Stores 3.14 in variable x
        double x = 3.14;
        // Stores -10 in variable y
        double y = -10;
        // Finds the larger value between x and y
        double z = Math.max(x, y);
        // Prints the larger value
        System.out.println(z);
        // Finds the smaller value between x and y
        z = Math.min(x, y);
        // Prints the smaller value
        System.out.println(z);
        // Finds the absolute value of y (removes the negative sign)
        z = Math.abs(y);
        // Prints the absolute value
        System.out.println(z);
        // Finds the square root of y (negative numbers give NaN)
        z = Math.sqrt(y);
        // Prints the result
        System.out.println(z);
        // Changes y to 3.16
        y = 3.16;
        // Finds the square root of y
        z = Math.sqrt(y);
        // Prints the square root
        System.out.println(z);
        // Rounds x to the nearest whole number
        z = Math.round(x);
        // Prints the rounded value
        System.out.println(z);
        // Rounds x up to the next whole number
        z = Math.ceil(x);
        // Prints the rounded-up value
        System.out.println(z);
        // Rounds x down to the previous whole number
        z = Math.floor(x);
        // Prints the rounded-down value
        System.out.println(z);





    }

}
