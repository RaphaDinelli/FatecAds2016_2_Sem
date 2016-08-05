import java.util.Scanner;
/* Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static void main(String[] args) {
  	double numero1, numero2, diferenca;
  	
    System.out.println("Digite o valor do primeiro número: ");
    Scanner inNumero1 = new Scanner(System.in);
    numero1 = inNumero1.nextInt();
    
    System.out.println("Digite o valor do segundo número: ");
    Scanner inNumero2 = new Scanner(System.in);
    numero2 = inNumero2.nextInt();
    
    diferenca = numero1 - numero2;
    System.out.println("A diferença entre o primeiro e o segundo número é: " + diferenca);
  }
}
