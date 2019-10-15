// André Nascimento
// GitHub: https://github.com/AndreNasci
// Linkedin: linkedin.com/in/andré-nascimento-a01095185

// Tratamento de exceções
// ExceDemo.java

public class ExceDemo {

  // Método que testa o funcionamento do bloco finally
  // apesar do return dentro do bloco try.
  public static  boolean testaFinally() {

    try {
      if ( true ) {
        return true;
      }
    }
    catch ( Exception e ) {
      System.out.println( "Erro: " + e );
    }
    finally {
      System.out.println( "Excecutado apesar do return. " );
    }
    return false;

  } //end method testaFinally

  public static void main ( String[] args ) {

    // cria um array de 10 posições de inteiro
    int[] aux = new int[10];

    // preenche o array com valores ordenados
    for ( int i=0; i<10; i++ ) {
      aux[i] = i;
    }

    // Dentro do bloco try fica todo código que pode
    // lançar um exceção.
    // O bloco catch contém o código que lida com a
    // exceção caso alguma ocorra.

    try {
      // tenta acessar um index out of bounds
      System.out.println( aux[10] );
    }
    catch ( Exception e ) {
      // "captura" a exceção ArrayIndexOutOfBoundsException

      e.printStackTrace();

      // obtém informações de rastreamento de pilha
      StackTraceElement[] traceElements = e.getStackTrace();

      System.out.printf("%nStack trace from getStackTrace:%n");
      System.out.println("Class\t\tFile\t\tLine\tMethod");

      // loop por traceElements para obter a descrição da exceção
      for ( StackTraceElement it : traceElements ) {
        System.out.printf( "%s\t", it.getClassName() );
        System.out.printf( "%s\t", it.getFileName() );
        System.out.printf( "%s\t", it.getLineNumber() );
        System.out.printf( "%s%n", it.getMethodName() );
      }
    }

    // Pode haver diversos blocos catch para tratar
    // exceções de forma mais específica.
    // Apenas o primeiro bloco catch que corresponde
    // à exceção é executado.

    try {
      // tenta acessar um index out of bounds
      System.out.println( aux[10] );
    }
    catch ( ArrayIndexOutOfBoundsException e ) {
      // ArrayIndexOutOfBoundsException deriva de Exception
      System.out.println( "Erro: " + e );
    }
    catch ( Exception e ) {
      // a exceção foi "capturada" em ArrayIndexOutOfBoundsException
      // assim:
      System.out.println( "Este bloco catch não é executado." );
    }

    // A superclasse deve sempre vir após as subclasses, para
    // garantir que essas sejam capturadas.

    // Sem o bloco try/catch o programa não executaria essa parte
    System.out.println( "\nEssa parte ainda é executada!" );

    // O bloco finally é opcional.
    // É excecutado mesmo após uma instrução continue, break
    // ou return dentro de um bloco try.
    // Ideal parar lidar com liberação de recursos adquiridos,
    // como fechar arquivos abertos no bloco try.

    testaFinally();

  } //end method main

} //end class ExceDemo
