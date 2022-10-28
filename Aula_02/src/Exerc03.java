import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("****** Programa Categoria de Idade ***");
		System.out.print("Caro, usuário, favor digite o seu nome :\n");
		nome = leia.nextLine();
		System.out.printf("%s, Favor insira a sua Idade: \n",nome);
		idade = leia.nextInt();
		if(idade >= 10 && idade <=14){
			System.out.println("Categoria INFANTIL!");
		}
		else if(idade > 14 && idade < 18) {
			System.out.println("Categoria JUVENIL!");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria ADULTO!");
		}
		else{
			System.out.println("Intervalo sem Categoria Definida!");
		}

	}

}