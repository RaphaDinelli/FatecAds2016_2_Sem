import java.util.Scanner;
/* Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. 
 * Obs.: somente valores positivos.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int contador;
    double numeroDeEntrada, maior, menor;
    maior = -1;
    menor = -1;
    contador= 1;
    
    while (contador <= 100){
		System.out.println("Digite um número real: ");
	    Scanner inNumeroDeEntrada = new Scanner(System.in);
	    numeroDeEntrada = inNumeroDeEntrada.nextDouble();
	    if (numeroDeEntrada < 0){
	    	System.out.println("Número digitado negativo! Encerrando.");
	    	break;
	    };
	    if(numeroDeEntrada > maior){
	    	if (menor < 0){
	    		menor = maior;
	    		maior = numeroDeEntrada;
	    	}
	    	else{
	    		maior = numeroDeEntrada;
	    	};
	    }
	    else{
	    	if(menor < 0){
	    		menor = numeroDeEntrada;	
	    	}
	    	else if(numeroDeEntrada < menor){
	    		menor = numeroDeEntrada;
	    	};
	    };
	    contador ++;
    };
    if (maior>0 && menor>0){
   System.out.println("Maior: " + maior + "    |    Menor: " + menor); 
    };
  };
};
