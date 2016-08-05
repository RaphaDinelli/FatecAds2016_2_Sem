import java.util.Scanner;
/* Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
 * quantos anos terá daqui a 17 anos.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static void main(String[] args) {
  	int nascimento, anoAtual, idade;
  	final int anosParaSomar;
  	anosParaSomar = 17;
  	
    System.out.println("Digite o ano de nascimento: ");
    Scanner inNascimento = new Scanner(System.in);
    nascimento = inNascimento.nextInt();
    
    System.out.println("Digite o ano atual: ");
    Scanner inAnoAtual = new Scanner(System.in);
    anoAtual = inAnoAtual.nextInt();
    
    idade = anoAtual - nascimento;
    System.out.println("A idade atual é: " + idade);
    
    idade += anosParaSomar;
    
    System.out.println("A idade atual daqui a 17 anos é: " + idade);
  }
}
