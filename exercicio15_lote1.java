import java.util.Scanner;
/* Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    double cateto1, cateto2, hipotenusa;
    
    
    System.out.println("Digite o valor do primeiro cateto: ");
    Scanner inCateto1 = new Scanner(System.in);
    cateto1 = inCateto1.nextInt();
    
    System.out.println("Digite o valor do segundo cateto: ");
    Scanner inCateto2 = new Scanner(System.in);
    cateto2 = inCateto2.nextInt();
    
    // Converte kilos em gramas
    hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
    
    System.out.println("O valor da hipotenusa: " + hipotenusa);
    
    
  }
}
