import java.util.Scanner;

/* Calcule e mostre quantos anos serão necessários para que Ana seja maior que
 * Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
 * e cresce 2 cm ao ano.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
  	int anosNecessariosParaUltrapassarMaria;
    double ana, maria;
    final double cresceAna, cresceMaria;
    
    
    ana = 1.1;
    maria = 1.5;
    cresceAna = 0.3;
    cresceMaria = 0.2;
    anosNecessariosParaUltrapassarMaria = 0;
    while(ana <= maria){
    	ana += cresceAna;
    	maria += cresceMaria;
    	anosNecessariosParaUltrapassarMaria ++;
    };
    System.out.println("Anos necessários para Ana ultrapassar Maria: " + anosNecessariosParaUltrapassarMaria);
  };
};
