import java.util.Scanner;
/* Objetivo: Coletar o valor do lado de um quadrado, 
 * calcular sua área e apresentar o resultado.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static void main(String[] args) {
  	int lado, area;
    System.out.println("Digite o lado do quadrado: ");
    Scanner in = new Scanner(System.in);
    lado = in.nextInt();
    area = lado * lado;
    System.out.println("Area do quadrado: " + area);
  }
}
