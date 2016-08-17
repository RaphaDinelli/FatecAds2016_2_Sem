import java.util.Scanner;

/* Receba o número da base e do expoente. Calcule e mostre o valor da potência .
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
  	int base, expoente, contador, resultado;
  	
  	contador = 1;

  	System.out.println("Digite a base: ");
  	Scanner inBase = new Scanner(System.in);
  	base = inBase.nextInt();
  	
  	System.out.println("Digite o expoente: ");
  	Scanner inExpoente = new Scanner(System.in);
  	expoente = inExpoente.nextInt();
  	
  	resultado = base;
  	
  	while(contador < expoente){
  		resultado *= base;
  		contador ++;
  	};
  	System.out.println("Resultado: " + resultado);
  };
};
