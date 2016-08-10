import java.util.Scanner;
/* Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
 * Demais tipos não serão considerados.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int escolha, valorDoInvestimento;
    double rendimentoApos30Dias;
	
	System.out.println("Digite 1 para poupança e 2 para renda fixa: ");
	Scanner inEscolha = new Scanner(System.in);
	escolha = inEscolha.nextInt();
    
    System.out.println("Digite o valor do investimento: ");
	Scanner inValorDoInvestimento = new Scanner(System.in);
	valorDoInvestimento = inValorDoInvestimento.nextInt();
	
	switch (escolha){
		case 1:
			rendimentoApos30Dias = valorDoInvestimento + (valorDoInvestimento * 0.03);
			System.out.println("O rendimento após 30 dias é: " + rendimentoApos30Dias);
			break;
		case 2:
			rendimentoApos30Dias = valorDoInvestimento + (valorDoInvestimento * 0.05);
			System.out.println("O rendimento após 30 dias é: " + rendimentoApos30Dias);
			break;
		default:
			System.out.println("Opção informada não existe!");
	}
  }
}
