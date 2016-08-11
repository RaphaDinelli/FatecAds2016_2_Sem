import java.util.Scanner;
/* Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numero, incremento, total;
    incremento = 1;
    total = 1;
	System.out.println("Digite um número inteiro: ");
    Scanner inNumero = new Scanner(System.in);
    numero = inNumero.nextInt();
	while (incremento <= numero){
		total += 1/incremento;	
		incremento ++;
	};
	System.out.println("O total da serie é : " + total);
	}
  }
