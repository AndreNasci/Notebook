// André Nascimento
// GitHub: https://github.com/AndreNasci
// Linkedin: linkedin.com/in/andré-nascimento-a01095185

// Note2.java
// io methods (dialogs)

import javax.swing.JOptionPane;

public class Note2 {

  public static void main ( String args[] ) {

    // dialog output
    JOptionPane.showMessageDialog(null, "Hello World!");

    // dialog input
    String number = JOptionPane.showInputDialog("Enter an integer:");

    // converts String to int
    int numberInt = Integer.parseInt(number);

    // shows the number in a JOptionPane dialog message
    JOptionPane.showMessageDialog(null, "The number is " + number + "!");

    System.exit(0); // terminate application

  } //end method main

} //end class Note2
