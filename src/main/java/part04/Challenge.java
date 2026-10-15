package part04;
import javax.swing.JOptionPane;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args){
        double meal = Double.parseDouble(
                JOptionPane.showInputDialog("Enter the meal cost:")
        );

        int percent = Integer.parseInt(
                JOptionPane.showInputDialog("Enter the tip percent:")
        );

        int people = Integer.parseInt(
                JOptionPane.showInputDialog("How many people?")
        );

        double tip = meal * percent / 100;
        double total = meal + tip;
        double each = total / people;

        int wholeDollars = (int) each;
        int shortAmount = (int) total % people;

        JOptionPane.showMessageDialog(null,
                "Tip: $" + tip + "\nTotal: $" + total);

        JOptionPane.showMessageDialog(null,
                "Each person pays $" + each
                        + "\nIf everyone pays $" + wholeDollars
                        + ", you are still $" + shortAmount + " short.");
    }

}

