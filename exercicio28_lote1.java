import java.util.Scanner;
/* Receba o preço atual e a média mensal de um produto.Calcule e mostre o novo preço sabendo que:
 * Venda Mensal        Preço Atual   Preço Novo
   < 500                  < 30           + 10%
   >= 500 e < 1000    >= 30 e < 80       + 15%
   >= 1000                >= 80          - 5%
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int vendaMensal, precoAtual;
    double precoNovo;
	
	System.out.println("Digite quantidade mensal de vendas: ");
	Scanner inVendaMensal = new Scanner(System.in);
	vendaMensal = inVendaMensal.nextInt();
    
    System.out.println("Digite o preço atual do produto: ");
	Scanner inPreçoAtual = new Scanner(System.in);
	precoAtual = inPreçoAtual.nextInt();
	
	if ((vendaMensal >= 1000) && (precoAtual >= 80)){
		precoNovo = precoAtual - (precoAtual * 0.05);
	}
	else if ((vendaMensal >= 500) && (precoAtual >= 30 ) && (precoAtual < 80)){
		precoNovo = precoAtual + (precoAtual * 0.15);
	}
	else if ((vendaMensal < 500) && (precoAtual < 30)){
		precoNovo = precoAtual + (precoAtual * 0.10);
	}
	else{
		precoNovo = precoAtual;
	};
	
	System.out.println("O preço novo é: " + precoNovo);
  }
}
