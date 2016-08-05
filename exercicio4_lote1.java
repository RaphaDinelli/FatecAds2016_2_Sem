import java.util.Scanner;
/* Objetivo: 
 * Receba a temperatura em graus Celsius.
 * Calcule e mostre a sua temperatura convertida em fahrenheit (F = (9*C+160)/5.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static void main(String[] args) {
  	double temperaturaCelcius, temperaturaFahrenheit;
    System.out.println("Digite a temperatura em Celcius: ");
    Scanner in = new Scanner(System.in);
    temperaturaCelcius = in.nextDouble();
    temperaturaFahrenheit = (9 * temperaturaCelcius + 160) / 5;
    System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
  }
}
