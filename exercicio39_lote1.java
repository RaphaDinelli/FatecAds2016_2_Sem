import java.util.Scanner;

/* Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 * Casa: 1 2 3 4 ... 64
 * Qte: 1 2 4 8 ... N
 * Obs.: somente valores positivos.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int casa, quantidade, total;
    casa = 0;
    quantidade = 2;
    total = 0;
    for(int i=1; i<=64; i++){
    	total += Math.pow(quantidade, casa);
    	casa ++;
    	quantidade ++;
    };
    System.out.println("Quantidade de grãos é: " + total);
  };
};
