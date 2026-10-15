package part05;
import java.util.Random;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s
//        random numbers start at about 64:10 — stop at about 68:28
// Guide: GUIDE.md in this folder, steps 11–16
//
// Part 05 — random numbers: nextInt, nextDouble, nextBoolean
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called RandomNumbers.
//    (Do NOT name it Random. Java already has a class called Random.)
//    Leave the "package part05;" line and the "public class RandomNumbers" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class RandomNumbers {
    public static void main(String[] args){
        // Creates a Random object to generate random values
        Random random = new Random();
        // Generates a random integer from 1 to 6
        int x = random.nextInt(6) +1;
        // Prints the random integer
        System.out.println(x);
        // Generates a random decimal from 0.0 (inclusive) to 1.0 (exclusive)
        double y = random.nextDouble();
        // Prints the random decimal
        System.out.println(y);
        // Generates a random boolean value (true or false)
        boolean z = random.nextBoolean();
        // Prints true or false
        System.out.println(z);


    }


}
