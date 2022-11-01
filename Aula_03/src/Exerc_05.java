import java.util.Scanner;

public class Exerc_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int numero=0,
			 cont=0,
		     media=0,
		     soma=0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero >= 0)
				soma = soma + numero;
			cont++;
		}while(numero != 0);
		
		media = soma / cont;
		
	System.out.println("A soma dos números positivos é: "+soma);
	System.out.println("A média dos números positivos é: "+media);
	}

}
