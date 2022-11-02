import java.util.Scanner;

public class Exerc_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		//int[] vetorNumero = new int[10];
		int[] vetorNumero= {2,5,1,3,4,9,7,8,10,6};
		int numero;
		
		for(int i=0; i<vetorNumero.length; i++){
			
			System.out.println("Digite o número que você deseja encontrar: ");
			numero = leia.nextInt();
			System.out.println("O número está localizado na posição: "+vetorNumero[i]);
		}

	}

}
