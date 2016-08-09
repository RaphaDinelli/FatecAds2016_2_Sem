import java.util.Scanner;
/*Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int num1, num2;
    
    
    System.out.println("Digite o primeiro número: ");
    Scanner inNum1 = new Scanner(System.in);
    num1 = inNum1.nextInt();
    
    System.out.println("Digite o segundo número: ");
    Scanner inNum2 = new Scanner(System.in);
    num2 = inNum2.nextInt();
    
    if (num1 > num2){
    	System.out.println(num2+ ", " + num1);
    }
    else{
    	System.out.println(num1+ ", " + num2);
    };
  }
}
