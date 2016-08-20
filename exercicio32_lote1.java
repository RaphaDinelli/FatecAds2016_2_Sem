import java.util.Scanner;
/* Receba um número inteiro. Calcule e mostre o seu fatorial.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numero, fat;
    fat = 1;
    System.out.println("Digite um número inteiro: ");
    Scanner inNumero = new Scanner(System.in);
    numero = inNumero.nextInt();
	for(int i = 1; i < numero; i ++ ){
		fat *= i + 1;
		System.out.println("Fatorial de " + numero + " é : " + fat);
	}
  }
}
