package part04;
import javax.swing.JOptionPane;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        starts at about 53:11 — stop at about 58:10, at "in conclusion ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 04, topic 2 — pop-up windows with JOptionPane
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called GUI.
//    Leave the "package part04;" line and the "public class GUI" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part04;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

public class GUI {
    public static void main(String[] args){
        // Stores 10 in a double variable
        double friends = 10;
        // Divides friends by 3 using decimal division
        friends = (double) friends / 3;
        // Prints the result in the console
        System.out.println(friends);
        // Asks the user to enter their name
        String name = JOptionPane.showInputDialog("Enter your name");
        // Displays a greeting using the user's name
        JOptionPane.showMessageDialog(null,"Hello "+ name);
        // Asks the user for their age and converts the input to an integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // Displays the user's age
        JOptionPane.showMessageDialog(null, "You are " + age + " Years old." );
        // Asks the user for their height and converts the input to a double
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        // Displays the user's height in centimeters
        JOptionPane.showMessageDialog(null,"You are" + height + "cm tall.");






        }



    }


