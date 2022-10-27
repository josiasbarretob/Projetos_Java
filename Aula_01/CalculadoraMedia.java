import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double nota1,
			   nota2,
			   nota3,
			   nota4,
			   media;
		System.out.println("Favor insira a primeira nota :");
		nota1 = leia.nextDouble();
		System.out.println("Favor insira a segunda nota :");
		nota2 = leia.nextDouble();
		System.out.println("Favor insira a terceira nota :");
		nota3 = leia.nextDouble();
		System.out.println("Favor insira a quarta nota :");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA média das notas digitadas: %.1f, %.1f, %.1f, %.1f é = %.1f",nota1, nota2, nota3, nota4, media);
				
	}

}
