import java.util.Scanner;
/* Objetivo: 
 * Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static void main(String[] args) {
  	int x, y, troca;
    System.out.println("Digite o valor de x: ");
    Scanner inX = new Scanner(System.in);
    x = inX.nextInt();
    System.out.println("Digite o valor de y: ");
    Scanner inY = new Scanner(System.in);
    y = inY.nextInt();
    troca = x;
    x = y;
    y = troca;
    System.out.println("Valor de x agora é: " + x);
    System.out.println("Valor de y agora é: " + y);
    
  }
}
