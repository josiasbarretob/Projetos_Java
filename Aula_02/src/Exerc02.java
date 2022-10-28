import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String nome;
		int num1,
			num2,
			num3,
			maior;
		
		System.out.println("****** Programa Números em Ordem Crescente ***");
		System.out.print("Caro, usuário, favor digite o seu nome :\n");
		nome = leia.nextLine();
		System.out.printf("%s, Favor insira o primeiro número : \n",nome);
		num1 = leia.nextInt();
		System.out.printf("%s, Favor insira o segundo número : \n",nome);
		num2 = leia.nextInt();
		System.out.printf("%s, Favor insira o terceiro número : \n",nome);
		num3= leia.nextInt();
		
		if(num1 >= num2)
			maior = num1;
		else
			maior= num2;
		if(maior <= num3)
			maior = num3;
		System.out.println("o numero maior é" +maior);
	}

}
