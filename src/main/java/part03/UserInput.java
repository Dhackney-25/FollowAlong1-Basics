package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

public class UserInput {
    public static void main(String[] args){
        // Creates a Scanner to read input from the keyboard.
    Scanner scanner = new Scanner(System.in);
    //Asks the user to enter their name.
    System.out.println("What is your name?");
    // Reads the user's name and stores it in name.
    String name = scanner.nextLine();
    // Asks the user to enter their age.
    System.out.println("How old are you?");
    // Reads the user's age as a whole number.
    int age = scanner.nextInt();
    // Clears the leftover newline after reading the age.
    scanner.nextLine();
    // Asks the user for their favorite food.
    System.out.println("What is your favorite food?");
    // Reads the favorite food and stores it in food.
    String food = scanner.nextLine();
    // Prints a greeting using the user's name.
    System.out.println("Hello "+ name);
        // Prints the user's age.
    System.out.println("You are " + age + " years old");
        // Prints the user's favorite food.
    System.out.println("You like " + food);


    }
}
