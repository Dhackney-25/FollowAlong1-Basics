package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

/* Name: De'Kyii Hackney
 * Story Title: The Mysterious Space Adventure
 */

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name an astronaut:");
        String astronaut = scanner.nextLine();

        System.out.println("Name an alien:");
        String alien = scanner.nextLine();

        System.out.println("Pick a number:");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Name a planet:");
        String planet = scanner.nextLine();

        System.out.println("Name a strange food:");
        String food = scanner.nextLine();

        System.out.println(astronaut + " landed on " + planet + ".");
        System.out.println("They discovered " + number + " aliens led by " + alien + ".");
        System.out.println("The aliens offered everyone a plate of " + food + ".");

        String temp = astronaut;
        astronaut = alien;
        alien = temp;

        System.out.println("Plot twist: " + astronaut + " was the real hero, and " + alien + " was the alien mastermind!");

        scanner.close();
    }
}


