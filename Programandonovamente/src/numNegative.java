import java.util.Scanner;

import Entidades.metodosVetores;

public class numNegative {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		metodosVetores metodos = new metodosVetores();
		
		System.out.print("Quantos numeros pretende digitar?");
		metodos.setQuantidade_Numeros(scan.nextInt());//passando a qtd de numeros via encapsulamento.
		
		int[] array = new int[metodos.getQuantidade_Numeros()];
		for (int i = 0; i < metodos.getQuantidade_Numeros(); i++) {
			System.out.print("Digite um numero:");
			array[i] = scan.nextInt();
		}
		metodos.numNegative(array);
		scan.close();
	}
	
}
