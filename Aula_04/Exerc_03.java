	import java.util.Scanner;
	public class Matriz {
    public static void main(String[] args) {
        int i = 0;
        int j = 2;
        int soma = 0;
        String diagonalPrincipal="", diagonalSecundaria ="";
        int[][] numeros = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        while (i < 3)
        {
            diagonalPrincipal += numeros[i][i]+" ";
            soma = soma + numeros[i][i];
            i = i + 1;
        }
        System.out.println("Lista de números diagonal principal :"+diagonalPrincipal);
        System.out.println("\nA soma de diagonal principal :"+ soma+ "\n");

        i=0;
        soma = 0;
        while (j > -1)
        {
            diagonalSecundaria += numeros[i][j]+" ";
            soma = soma + numeros[i][i];
            i = i + 1;
            j = j - 1;
        }
        System.out.println("Lista de números diagonal secundaria:"+diagonalSecundaria+" \n");
        System.out.println("A soma de diagonal principal :"+ soma+ "\n");

    }
}