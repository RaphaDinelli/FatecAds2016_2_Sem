import java.util.Scanner;

/* Receba 2 números inteiros. Verifique e mostre todos os números primos
 * existentes entre eles.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numero1, numero2;
    boolean primo;
    
    primo = true;
    
    System.out.println("Digite o primeiro número: ");
    Scanner inNumero1 = new Scanner(System.in);
    numero1 = inNumero1.nextInt();
    
    System.out.println("Digite o segundo número: ");
    Scanner inNumero2 = new Scanner(System.in);
    numero2 = inNumero2.nextInt();
    
    for(int i=numero1; i<numero2; i++){
    	for(int j=2; j<i; j++ ){
    		if(i % j ==0){
    			primo = false;
    			break;
    		}
    	};
    	if(primo){
    		System.out.println(i + ", ");
    	}
    	else{
    		primo = true;
    	};
    };
  };
};
