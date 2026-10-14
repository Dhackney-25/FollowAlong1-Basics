package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1340s
//        starts at about 22:20 — stop at about 35:00, after he prints "Hello Bro"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 02 — variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Variables.
//    Leave the "package part02;" line and the "public class Variables" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in
//  YOUR OWN WORDS what that line does. The README shows an example.

public class Variables {
    public static void main(String[] args){
        // int holds whole numbers held by the variable x
        int x;
        // we are assigning x a whole digit number
        x = 123;
        // This line of code prints the integer
        System.out.println(x);
        // This line of code prints the letter x
        System.out.println("x");
        //This line of code prints out a sentence with our variable number
        System.out.println("My number is " + x);

        // This holds a number thats too big for an int to hold
        long debt = 3000000000L;
        // This line prints out the long number
        System.out.println(debt);
        // This line of code declares a byte variable named b, assigns it the value 100,
        byte b = 100;
        // This line of code prints the value of b to the screen.
        System.out.println(b);
        // Declares a float variable named y and assigns it the value 3.14.
        float y = 3.14f;
        // Prints the value of y to the screen.
        System.out.println(y);
        // Declares a double variable named y2 and stores the decimal value 3.14.
        double y2 = 3.14;
        // Prints the value of y2 to the screen.
        System.out.println(y2);
        //This line of code uses boolean to give us a result of true
        boolean z = true;
        //Prints the value of z to the screen.
        System.out.println(z);
        // Declares a char variable named symbol and stores the character '@'.
        char symbol = '@';
        // Prints the value of symbol to the screen.
        System.out.println(symbol);
        // Declares a String variable named name and stores the text "Bro".
        String name = "Bro";
        // Prints "Hello " followed by the value stored in name.
        System.out.println("Hello " + name);

    }

}
