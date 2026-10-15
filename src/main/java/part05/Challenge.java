package part05;
import java.util.Scanner;
import java.util.Random;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        rewatch 61:29–63:52 for Scanner + Math, 66:47–67:40 for dice rolls
// Guide: GUIDE.md in this folder, steps 7–10 and 13–14
//
// SECTION D — Challenge. The dice report. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                Random random = new Random();

                System.out.print("What is your name? ");
                String name = input.nextLine();

                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;

                int total = die1 + die2;
                System.out.println(name + " rolled a " + die1 + " and a " + die2);
                System.out.println("Total: " + total);
                System.out.println("Higher die: " + Math.max(die1, die2));
                System.out.println("Lower die: " + Math.min(die1, die2));
                System.out.println("Difference: " + Math.abs(die1 - die2));

                double average = total / 2.0;
                System.out.println("Average: " + average);
                System.out.println("Average, rounded: " + Math.round(average));

                input.close();
            }
        }
