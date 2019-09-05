// André Nascimento
// GitHub: https://github.com/AndreNasci
// Linkedin: linkedin.com/in/andré-nascimento-a01095185

// Note3.java
// This file uses PersonInfo class
// object orientation

import javax.swing.JOptionPane;

public class Note3 {

  public static void main ( String args[] ) {

    PersonInfo person = new PersonInfo(); // creates a new object

    String name = JOptionPane.showInputDialog("Enter your name: ");
    String age = JOptionPane.showInputDialog("Enter your age:");
    String coef = JOptionPane.showInputDialog("Enter your coef.(with dot):");

    // set all the attributes
    person.setName( name );
    person.setAge( Integer.parseInt(age) );
    person.setCoef( Double.parseDouble(coef) );

    // prints the attributes in a dialog window
    JOptionPane.showMessageDialog( null, "Name: " + person.getName()
      + "\nAge: " + person.getAge()
      + "\nCoef.: " + person.getCoef() );

    System.exit(0); // terminate application

  } //end method main

} //end class Note3
