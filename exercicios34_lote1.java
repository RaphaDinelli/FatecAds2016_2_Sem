import java.util.Scanner;
/* Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numero, resultado, i;
    
	System.out.println("Digite um número inteiro: ");
    Scanner inNumero = new Scanner(System.in);
    numero = inNumero.nextInt();
    
    for(i = 1; i<10; i++){
    	resultado = numero * i;
    	System.out.println(numero + " X " + i + " = " + resultado);
    };
  };
}
