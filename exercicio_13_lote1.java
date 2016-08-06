import java.util.Scanner;
/* Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento*sabendo que a pessoa consome 50g ao dia.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int alimentoEmQuilos, duracaoDoAlimentoEmQuilos;
    final int gramasConsumidasPorDia;
    gramasConsumidasPorDia = 50;
    
    System.out.println("Digite a quantidade de alimento em quilos: ");
    Scanner inAlimentoEmQuilos = new Scanner(System.in);
    alimentoEmQuilos = inAlimentoEmQuilos.nextInt();
    
    // Converte kilos em gramas
    alimentoEmQuilos *= 1000;
    
    duracaoDoAlimentoEmQuilos = alimentoEmQuilos / gramasConsumidasPorDia;
    
    System.out.println("O aliemento irá durar " + duracaoDoAlimentoEmQuilos + " dias.");
    
    
  }
}
