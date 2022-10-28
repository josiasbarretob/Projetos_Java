import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1,
			rest;
		
		System.out.println("*****Programa Par/Impar*****");
		System.out.println("Digite um número : "); //--- Entrada de Dados.
		n1 = leia.nextInt();
		
		rest = n1 % 2; //--- Processamento.
		
		if(rest == 0) {
			System.out.println("Número PAR! E a sua Raiz Quadrada é: "+Math.sqrt(n1));
		}
		else {
			System.out.println("Número ÍMPAR! E o seu valor elevado ao Quadrado é: "+Math.pow(n1,2));
		}
	}

}
