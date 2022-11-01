import java.util.Scanner;

public class Exerc_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int result=0,
			   par=0,
			 impar=0;
		
		for(int cont=1; cont <= 10; cont++){
			
			System.out.println("Digite o " +cont+ "º número: ");
			int numero = leia.nextInt();
			result = numero % 2;
			if(result == 0)
				par++;
			else
				impar++;
		}
		
		System.out.println("Total de números pares : "+par);
		System.out.println("Total de números impares : "+impar);

	}

}
