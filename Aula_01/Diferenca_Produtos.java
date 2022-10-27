import java.util.Scanner;

public class Diferenca_Produtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int numero1,
		    numero2,
		    numero3,
		    numero4,
		    diferenca;
		
		System.out.println("Favor insira o primeiro número :");
		numero1 = leia.nextInt();
		System.out.println("Favor insira o segundo número :");
		numero2 = leia.nextInt();
		System.out.println("Favor insira o terceiro número :");
		numero3 = leia.nextInt();
		System.out.println("Favor insira o quarto número :");
		numero4 = leia.nextInt();
		
		diferenca = (numero1 * numero2)-(numero3 * numero4);
		
		System.out.println("A diferença do produto entre (" +numero1+ " x " +numero2+ ") - (" +numero3+ " x " +numero4+ ") = " +diferenca);
				
	}

}
