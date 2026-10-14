package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION D — Challenge. A video game character card. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args){
        String name;
        name = "Inferno";

        int level = 25;
        long gold = 8000000000L;
        double health = 95.75;
        float speed = 6.5f;
        boolean flies = true;
        char rank = 'S';

        System.out.println("===== HERO CHARACTER CARD =====");
        System.out.println("Name:\t" + name);
        System.out.println("Level:\t" + level);
        System.out.println("Gold:\t" + gold);
        System.out.println("Health:\t" + health);
        System.out.println("Speed:\t" + speed);
        System.out.println("Flies:\t" + flies);
        System.out.println("Rank:\t" + rank);
    }
}

