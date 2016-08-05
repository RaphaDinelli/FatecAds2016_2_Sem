import java.util.Scanner;
/* Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static void main(String[] args) {
  	int numero1, numero2, somaDosQuadrados;
  	
    System.out.println("Digite o valor do primeiro número: ");
    Scanner inNumero1 = new Scanner(System.in);
    numero1 = inNumero1.nextInt();
    
    System.out.println("Digite o valor do segundo número: ");
    Scanner inNumero2 = new Scanner(System.in);
    numero2 = inNumero2.nextInt();
    
    somaDosQuadrados = (numero1 * numero1) + (numero2 * numero2);
    System.out.println("A soma dos quadrados é: " + somaDosQuadrados);
  }
}
