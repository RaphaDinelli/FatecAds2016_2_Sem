import java.util.Scanner;
/* Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int angulo1, angulo2, angulo3;
    
    
    System.out.println("Digite o valor do primeiro angulo: ");
    Scanner inAngulo1 = new Scanner(System.in);
    angulo1 = inAngulo1.nextInt();
    
    System.out.println("Digite o valor do segundo angulo: ");
    Scanner inAngulo2 = new Scanner(System.in);
    angulo2 = inAngulo2.nextInt();
    
    // Converte kilos em gramas
    angulo3 = 180 - (angulo1 + angulo2);
    
    System.out.println("O valor do 3º angulo é: " + angulo3);
    
    
  }
}
