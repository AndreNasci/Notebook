// André Nascimento
// GitHub: https://github.com/AndreNasci
// Linkedin: linkedin.com/in/andré-nascimento-a01095185

// Note1.java
// io methods (prompt)

import java.util.Scanner; // class that lets you read data

public class Note1 {

  public static void main ( String args[] ) {

    Scanner input = new Scanner( System.in );

    // a new Scanner just for String's to avoid bugs
    Scanner inputStr = new Scanner( System.in );

    int numI;
    double numD;
    boolean bool;
    String name;

    System.out.println("Hello World!"); // the basic

    System.out.print("Enter an integer: ");
    numI = input.nextInt(); // read an integer from user
    System.out.printf("%d x 10 = %d\n", numI, numI*10);

    System.out.print("Enter a double: ");
    numD = input.nextDouble(); // read a double from user (with comma)
    System.out.printf("%.2f x 1.5 = %.2f\n", numD, numD*1.5);

    System.out.print("Enter a boolean: ");
    bool = input.nextBoolean(); // read a boolean from user (true, false)
    System.out.printf("Value: %b\n", bool);

    System.out.print("Enter a name: ");
    name = inputStr.nextLine(); // read a String from user
    System.out.printf("Your name is: %s\n", name);

  } //end method main

} //end class Note1
