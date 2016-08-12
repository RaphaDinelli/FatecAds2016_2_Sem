import java.util.Scanner;
/* Receba 2 números inteiros, verifique qual o maior entre eles.
 * Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int num1, num2, resultadoSomatoriaImpar;

    resultadoSomatoriaImpar = 0;
    
	System.out.println("Digite um número inteiro: ");
    Scanner inNum1 = new Scanner(System.in);
    num1 = inNum1.nextInt();
    
    System.out.println("Digite um número inteiro: ");
    Scanner inNum2 = new Scanner(System.in);
    num2 = inNum2.nextInt();
    
    if (num1 > num2){
    	for(i=num2; i < num1; i++){
    		if(i%2>0){
    			resultadoSomatoriaImpar += i;
    		};
    	};
    }
    else{
    	for(i=num1; i < num2; i++){
    		if(i%2>0){
    			resultadoSomatoriaImpar += i;
    		};
    	};	
    };
    System.out.println("Resultado da somatória é: " + resultadoSomatoriaImpar);
  };
};
