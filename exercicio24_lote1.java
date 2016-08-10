import java.util.Scanner;
/*Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numero;
    
    
    System.out.println("Digite um número inteiro: ");
    Scanner inNumero = new Scanner(System.in);
    numero = inNumero.nextInt();
    
    if (numero % 2 ==0){
    	if (numero % 3 == 0){
    		System.out.println(numero + " é divísivel por 2 e 3!");
    	}
    	else{
    		System.out.println(numero + " não é divísivel por 2 e 3!");
    	};
    }
    else{
    	System.out.println(numero + " não é divísivel por 2 e 3!");
    };
  }
}
