import java.util.Scanner;
/* Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numeroN, fib1, fib2, auxiliar;
    
    fib1 = 1;
    fib2 = 1;
    
	System.out.println("Digite um número inteiro: ");
    Scanner inNumeroN = new Scanner(System.in);
    numeroN = inNumeroN.nextInt();
    
    System.out.println(fib1);
    System.out.println(fib2);
    
    while (fib2 < numeroN){
    	auxiliar = fib2;
    	fib2 = fib1 + fib2;
    	fib1 = auxiliar;
    	System.out.println(fib2);
    };
  };
};
