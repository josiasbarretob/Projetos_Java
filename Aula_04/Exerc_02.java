import java.util.Scanner;
public class Exerc_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int[] numero=new int[10];
		int soma=0;
		float media=0.f;
		String indicesImpares="", elementosPares="";
		
		for(int i=0 ; i<numero.length ; i++){
			System.out.printf("Favor digite o %dº número : ",i+1);
			numero[i]= leia.nextInt();
			soma = soma+numero[i];
			media = soma/numero.length;
		}
		for(int i=1 ;  i < numero.length ; i+=2){
			indicesImpares += numero[i] + " ";
		}
		for(int i=0; i<numero.length ;i++) {
			if(numero[i]%2==0)
				elementosPares+=numero[i] + " ";
		}
			
		System.out.println("Elementos nos índices ímpares: "+indicesImpares);
		System.out.println("Elementos pares: "+elementosPares);
		System.out.println("Soma: "+soma);
		System.out.printf("Média: %.2f",media);
	}

}
