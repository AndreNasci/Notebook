// André Nascimento
// GitHub: https://github.com/AndreNasci
// Linkedin: linkedin.com/in/andré-nascimento-a01095185

// AssertDemo.java
// Assertions e throws

// obs: java -ea AssertDemo ativa as assertions

import java.util.Scanner;

public class AssertDemo {

  // Métodos que lançam exceções obrigatórias devem
  // citar em seu protótipo a palavra reservada throws
  // seguida do tipo de exceção que é lançada em seu
  // interior.

  // Método que demonsta o funcionamento do throw.
  public static void testaThrow ( int n ) throws Exception {

    if ( n < 0 ) {
      // cria uma nova exceção
      throw new Exception( "(THROW) Número digitado é negativo." );
    }

  } //end method testaThrow

  public static void main ( String[] args ) {

    Scanner input = new Scanner( System.in );

    int num = input.nextInt();

    // THROW:
    // Especifica um objeto a ser lançado.
    try {
      testaThrow( num );
    }
    catch( Exception e ) {
      e.printStackTrace();
    }

    // ASSERTIONS:
    // Utilizados somente para debug e ambiente de
    // desenvolvimento.
    // Um assert só lança uma exceção se o valor de
    // sua condição for falso.
    assert ( num > 0 ) : "(ASSERT) Número digitado é negativo.";

  } //end method main

} //end class AssertDemo
