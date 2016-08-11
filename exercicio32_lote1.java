import java.util.Scanner;
/* Calcule e mostre o quadrado dos números entre 10 e 150.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numero, fat, i;
    i = 0;
    fat = 1;
	System.out.println("Digite um número inteiro: ");
    Scanner inNumero = new Scanner(System.in);
    numero = inNumero.nextInt();
	for(i = 1; i < numero; i ++ ){
		fat *= i + 1;
		System.out.println("Fatorial de " + numero + " é : " + fat);
	}
  }
}
