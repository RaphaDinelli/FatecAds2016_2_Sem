import java.util.Scanner;
/* Receba os valores do comprimento, largura e altura de um paralelepípedo. 
 * Calcule e mostre seu volume.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static void main(String[] args) {
  	int comprimento, largura, altura, volume;
  	
    System.out.println("Digite o comprimento: ");
    Scanner inComprimento = new Scanner(System.in);
    comprimento = inComprimento.nextInt();
    
    System.out.println("Digite a largura: ");
    Scanner inLargura = new Scanner(System.in);
    largura = inLargura.nextInt();
    
    System.out.println("Digite a altura: ");
    Scanner inAltura = new Scanner(System.in);
    altura = inAltura.nextInt();
    
    volume = comprimento * altura * largura;
    
    System.out.println("O volume do paralelepípedo é: " + volume);
  }
}
