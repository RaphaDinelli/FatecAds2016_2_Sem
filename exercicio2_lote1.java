import java.util.Scanner;
/* Objetivo: 
 * Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static void main(String[] args) {
  	int salario;
  	final double reajuste;
  	reajuste = 0.15;
    System.out.println("Digite o valor do sálario: ");
    Scanner in = new Scanner(System.in);
    salario = in.nextInt();
    salario += (salario * reajuste);
    System.out.println("O valor do salário reajustado é : R$" + salario);
  }
}
