package part04;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s
//        (this part's lesson starts here — GUIDE.md has it written out)

// Warm-up — 5 minutes, before the video. Practice, not graded.
//
// Open part03/Stretch.java. Look at your Stretch B1 (ask a name, say hi)
// for 30 seconds. Then close it.
// Without looking again, make this file do the same thing.
//
// You will need the import line, the Scanner, and the main method. Type them all.

public class Warmup {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "!");

    }


}
