import java.util.Scanner;
/*Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numero1, numero2;
    
    
    System.out.println("Digite um número inteiro: ");
    Scanner inNumero1 = new Scanner(System.in);
    numero1 = inNumero1.nextInt();
    
    System.out.println("Digite outro número inteiro: ");
    Scanner inNumero2 = new Scanner(System.in);
    numero2 = inNumero2.nextInt();
    
    if (numero1 > numero2){
    	if (numero1 % numero2 == 0){
    		System.out.println(numero1 + " é divísivel por " + numero2);
    	}
    	else{
    		System.out.println(numero1 + " não é divísivel por " + numero2);
    	};
    }
    else{
    	if (numero2 % numero1 == 0){
    		System.out.println(numero2 + " é divísivel por " + numero1);
    	}
    	else{
    		System.out.println(numero2 + " não é divísivel por " + numero1);
    	};
    };
  }
};
