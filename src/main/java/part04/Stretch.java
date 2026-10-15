package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2915s
//        rewatch 48:35–52:25 for + - * / % ++ -- and casting
// Guide: GUIDE.md in this folder, steps 1–6
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
/*
2
2
2.5
11
10
3.5
6

*/
public class Stretch {
    public static void main(String[] args){
      int n = 10;
      System.out.println(n / 4);
      System.out.println(n % 4);
      System.out.println(n / 4.0);
      n++;
      System.out.println(n);
      n--;
      System.out.println(n);
      System.out.println((double) 7 /2);
      System.out.println(7/2 * 2);

      int p = 4;
      double dollars = 50;
      System.out.println( dollars / p );

      int seconds = 500;
      int minutes = seconds / 60;
      int secondsleft = seconds % 60;
      System.out.println(minutes + " minutes and " + secondsleft + " seconds.");

      int Score1 =  90;
      int score2 = 85;
      int score3 = 78;
      int total = Score1 + score2 + score3;

      System.out.println(total /3);
      System.out.println((double)total/ 3);




    }

}
