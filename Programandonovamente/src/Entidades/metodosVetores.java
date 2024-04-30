package Entidades;

public class metodosVetores {
	private int quantidade_Numeros;
	
	//encapsulamentos.
	public int getQuantidade_Numeros() {
		return quantidade_Numeros;
	}
	public void setQuantidade_Numeros(int number) {
		this.quantidade_Numeros = number;
	}
	//metodo para imprimir numeros negativos.
	public void numNegative(int[] vetor) {
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			if( vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
	}
}