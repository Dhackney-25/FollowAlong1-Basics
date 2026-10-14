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
        int x;
        x = 123;
        System.out.println(x);
        System.out.println("x");
        System.out.println("My number is " + x);

        long debt = 3000000000L;
        System.out.println(debt);

        byte b = 100;
        System.out.println(b);

        float y = 3.14f;
        System.out.println(y);
        double y2 = 3.14;
        System.out.println(y2);

        boolean z = true;
        System.out.println(z);

        char symbol = '@';
        System.out.println(symbol);

        String name = "Bro";
        System.out.println("Hello " + name);

    }

}
