
package calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DecimalFormat df = new DecimalFormat(###.##);
		Scanner leia = new Scanner(System.in);
		int numero1,numero2;
		
		System.out.println("Digite o primeiro número :");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número :");
		numero2 = leia.nextInt();
		
		System.out.println("\n" +numero1+ " + " +numero2+ " = " +(numero1+numero2));
		System.out.println("\n" +numero1+ " - " +numero2+ " = " +(numero1-numero2));
		System.out.println("\n" +numero1+ " * " +numero2+ " = " +(numero1*numero2));
		System.out.println("\n" +numero1+ " / " +numero2+ " = " +(numero1/numero2));
		System.out.println("\n" +numero1+ " ^ " +numero2+ " = " +Math.pow(numero1, numero2));
		System.out.println("\n Raiz quadrada de " +numero1+ " = " +Math.sqrt(numero1));
	}

}
