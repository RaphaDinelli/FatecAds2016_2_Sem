import java.util.Scanner;

/* Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
 * resultado 7.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numero = 1;
   	while(numero < 7){
   		for(int i=1; i<7; i++){
   			if(numero + i ==7){
   				System.out.println(numero + " + " + i + " = 7");
   			};
   		};
   		numero ++;
   	};
  };
};
