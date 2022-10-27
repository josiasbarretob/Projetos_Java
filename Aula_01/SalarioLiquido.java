import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double salario1,
			   adicionalN,
			   desconto,
			   salarioLiquido;
		
		int horas;	   
		
		System.out.println("Favor insira o seu Salário Bruto R$ ");
		salario1 = leia.nextDouble();
		System.out.println("Favor insira o seu Adicional Noturno R$ ");
		adicionalN = leia.nextDouble();
		System.out.println("Favor insira a quantidade de Horas Extras: ");
		horas = leia.nextInt();
		System.out.println("Favor insira o valor do Desconto R$ ");
		desconto = leia.nextDouble();
		
		//SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADIC. NOTURNO + (H. EXTRAS * 5) - DESCONTOS
		
		salarioLiquido = salario1 + adicionalN + (horas * 5) - desconto;
		
		System.out.printf("O valor do novo Salário Líquido é = %.2f",salarioLiquido);

	}

}
