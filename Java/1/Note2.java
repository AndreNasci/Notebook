// André Nascimento
// GitHub: https://github.com/AndreNasci
// Linkedin: linkedin.com/in/andré-nascimento-a01095185

// Note2.java
// io methods (dialogs)

import javax.swing.JOptionPane;

public class Note2 {

 public static void main ( String args[] ) {

    JOptionPane.showMessageDialog(null, "Hello World!");

    String number = JOptionPane.showInputDialog("Enter an integer:");

    // converte String em valores int
    int numberInt = Integer.parseInt(number);

    // exibe o resultado em um diálogo de mensagem JOptionPane
    JOptionPane.showMessageDialog(null, "The number is " + number + "!");

    System.exit(0); // terminate application

 } //end method main

} //end class Note2
