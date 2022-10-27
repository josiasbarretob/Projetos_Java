import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		double  salario=0, abono=0, totalSalario;
		
		
		System.out.println(" ******===Calculadora de Abono ===******/n");
		System.out.println("Favor digite o seu nome: /n");
		String nome = leia.nextLine();
		System.out.println("Caro, "+nome+" ,Favor informe o seu salário:");
		salario = leia.nextDouble();
		System.out.println("Favor insira o valor do seu Abano: ");
		abono = leia.nextDouble();
		totalSalario = salario + abono;
		System.out.printf("%s,O seu novo salário é de R$ %.2f",nome,totalSalario);
	}

}
