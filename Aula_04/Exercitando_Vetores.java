
public class Exercitando_Vetores {

	public static void main(String[] args) {

		int[] num = new int[5];
		num[0]=0;
		num[1]=10;
		num[2]=20;
		num[3]=30;
		num[4]=40;
		
		int[] numeros = {0,10,20,30,40,50,60,70,80,90,100};
		
		//--- Como imprimir elementos individuais de um Vetor
		System.out.printf("O número na posicao 2 é %d : \n",num[2]);
		System.out.println("O número na posicao 2 é "+numeros[2]);
		
		//---Como listar todos os elementos de um vetor com o laco FOR
		for(int i=0 ; i < num.length; i++) {
			System.out.println(+i+"º posição - valor = "+num[i]);
		}
		//---Listando os elementos do vetor "numeros[]
		for(int indice=0 ; indice < numeros.length ; indice++) {
			System.out.printf("%dº posição - valor = %d \n", indice, numeros[indice]);
		}
	}

}
