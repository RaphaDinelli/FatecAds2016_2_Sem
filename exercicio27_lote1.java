import java.util.Scanner;
/* Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
 * Calcule e mostre a velocidade média em km/h.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numeroDeVoltas, extensaoDoCircuito, duracaoEmMinutos, velocidadeMediaEmKilometrosPorHora;
	
	System.out.println("Digite o numero de voltas: ");
	Scanner inNumeroDeVoltas = new Scanner(System.in);
	numeroDeVoltas = inNumeroDeVoltas.nextInt();
    
    System.out.println("Digite a extensão do circuito: ");
	Scanner inExtencaoDocircuito = new Scanner(System.in);
	extensaoDoCircuito = inExtencaoDocircuito.nextInt();
	
	System.out.println("Digite a duração da corrida: ");
	Scanner inDuracaoEmMinutos = new Scanner(System.in);
	duracaoEmMinutos = inDuracaoEmMinutos.nextInt();
	
	// Calcula a extenção total do circuito
	extensaoDoCircuito *= numeroDeVoltas;
	// Converte metros para km
	extensaoDoCircuito /= 1000;
	// Converte o tempo de duração para horas
	duracaoEmMinutos /= 60;
	//Calcula a velocidade média
	velocidadeMediaEmKilometrosPorHora = extensaoDoCircuito / duracaoEmMinutos;
	
	System.out.println("A velocidade média é: " + velocidadeMediaEmKilometrosPorHora);
  }
}
