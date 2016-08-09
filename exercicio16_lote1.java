import java.util.Scanner;
/* Receba a quantidade de horas trabalhadas, o valor por hora,
 * o percentual de desconto e o número de descendentes.Calcule o salário 
 * que serão as horas trabalhadas x o valor por hora.
 * Calcule o salário líquido (= Salário Bruto – desconto).
 * A cada dependente será acrescido R$ 100 no Salário Liquido.
 * Exiba o salário a receber.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    double valorHora, salario, horasTrabalhadas, percentualDeDesconto, numeroDeDependentes;
    final int valorPorDependente = 100;
    
    
    System.out.println("Digite a quantidade de horas trabalhadas: ");
    Scanner inHorasTrabalhadas = new Scanner(System.in);
    horasTrabalhadas = inHorasTrabalhadas.nextDouble();
    
    System.out.println("Digite o valor pago por hora: ");
    Scanner inValorHora = new Scanner(System.in);
    valorHora = inValorHora.nextDouble();
    
    System.out.println("Digite o percentual de desconto: ");
    Scanner inPercentualDeDesconto = new Scanner(System.in);
    percentualDeDesconto = inPercentualDeDesconto.nextDouble();
    percentualDeDesconto /= 100;
    
    System.out.println("Digite o número de dependentes: ");
    Scanner inNumeroDeDependentes = new Scanner(System.in);
    numeroDeDependentes = inNumeroDeDependentes.nextDouble();
    
    salario = (horasTrabalhadas * valorHora);
    salario -= salario * percentualDeDesconto + (numeroDeDependentes * valorPorDependente);
    
    System.out.println("O salário a receber é: R$" + salario);
    
    
  }
}
