import java.util.Scanner;

/* Receba 2 números inteiros. Verifique e mostre todos os números primos
 * existentes entre eles.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    double a, b, total;
    
    a = 2; 
    b = 3;
    total = a / b + 1;
    System.out.println("1 + " + a + " / " + b + " = " + total + " + ");
    
    while(b < 99){
    	a ++;
    	b += 2;
    	total += a / b;
    	System.out.println(a +  " / " +  b +  " = " +  total + " + ");
    };
  };
};
