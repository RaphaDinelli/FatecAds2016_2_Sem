import java.util.Scanner;
/* Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
 * Mostre os 4 números em ordem crescente.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int num1, num2, num3, num4;
    
    
    System.out.println("Digite o primeiro número: ");
    Scanner inNum1 = new Scanner(System.in);
    num1 = inNum1.nextInt();
    
    System.out.println("Digite o segundo número: ");
    Scanner inNum2 = new Scanner(System.in);
    num2 = inNum2.nextInt();
    
    System.out.println("Digite o terceiro número: ");
    Scanner inNum3 = new Scanner(System.in);
    num3 = inNum3.nextInt();
    
    System.out.println("Digite o quarto número: ");
    Scanner inNum4 = new Scanner(System.in);
    num4 = inNum4.nextInt();
    
    if (num4 < num1){
    	System.out.println(num4+ ", " + num1 + ", " + num2 + ", " + num3);
    }
    else if (num4 < num2){
    	System.out.println(num1+ ", " + num4 + ", " + num2 + ", " + num3);
    }
    else if (num4 < num3){
    	System.out.println(num1+ ", " + num2 + ", " + num4 + ", " + num3);
    }
    else{
    	System.out.println("O quarto número digitado precisa estar fora da ordem crescente!");
    };
  }
}
