import java.util.Scanner;
/* Receba o valor de um depósito em poupança. 
 * Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static void main(String[] args) {
  	final double juros = 0.013;
  	double deposito;
  	
    System.out.println("Digite o valor do deposito: ");
    Scanner inDeposito = new Scanner(System.in);
    deposito = inDeposito.nextInt();
    
    deposito += deposito * juros;
    System.out.println("O valor da aplicação com juros é: R$" + deposito);
  }
}
