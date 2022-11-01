import java.util.Scanner;

public class Exerc_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int idade=0,
			jovem=0,
			velho=0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade : ");
			idade= leia.nextInt();
			
			if(idade > 0 && idade < 21)
				jovem++;
			if(idade > 50)
				velho++;
		}
		System.out.println("Total de pessoas menores de 21 anos: "+jovem);
		System.out.println("Total de pessoas maiores de 50 anos:"+velho);
		
	}

}
