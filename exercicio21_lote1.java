import java.util.Scanner;
/* Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
 * Mostre a mensagem de acordo com a média:
 * a. Se a média for >= 6,0 exibir “APROVADO”;
 * b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 * c. Se a média for < 3,0 exibir “RETIDO”.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int nota1, nota2, nota3, nota4;
    double media;
    
    System.out.println("Digite a primeira nota: ");
    Scanner inNota1 = new Scanner(System.in);
    nota1 = inNota1.nextInt();
    
    System.out.println("Digite a segunda nota: ");
    Scanner inNota2 = new Scanner(System.in);
    nota2 = inNota2.nextInt();
    
    System.out.println("Digite a terceira nota: ");
    Scanner inNota3 = new Scanner(System.in);
    nota3 = inNota3.nextInt();
    
    System.out.println("Digite a quarta nota: ");
    Scanner inNota4 = new Scanner(System.in);
    nota4 = inNota4.nextInt();
    
    media = (nota1 + nota2 + nota3 + nota4) / 4;
    
    if (media >= 6){
    	System.out.println("A média é: " + media);
    	System.out.println("A situação é APROVADO");
    }
    else if (media >=3){
    	System.out.println("A média é: " + media);
    	System.out.println("A situação é EXAME");
    }
    else if(media < 3){
    	System.out.println("A média é: " + media);
    	System.out.println("A situação é RETIDO");
    };
  }
}
