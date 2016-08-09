import java.util.Scanner;
/* Receba 2 valores inteiros. 
 * Calcule e mostre o resultado da diferença do maior pelo menos valor.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int num1, num2, diferenca;
    
    
    System.out.println("Digite o primeiro número: ");
    Scanner inNum1 = new Scanner(System.in);
    num1 = inNum1.nextInt();
    
    System.out.println("Digite o segundo número: ");
    Scanner inNum2 = new Scanner(System.in);
    num2 = inNum2.nextInt();
    
    if (num1 > num2){
    	diferenca = num1 - num2;
    }
    else{
    	diferenca = num2 - num1;
    };
    
    System.out.println("Diferença do maior pelo menor: " + diferenca);
    
    
  }
}
