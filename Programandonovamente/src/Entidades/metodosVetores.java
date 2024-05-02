package Entidades;

public class metodosVetores {
	private int quantidade_Numeros;
	private int mediaDosItens;
	private int somatorio;
	
	//Encapsulamentos.
	public int getMediaDosItens() {
		return mediaDosItens;
	}
	public void setMediaDosItens(int mediaDosItens) {
		this.mediaDosItens = mediaDosItens;
	}
	public int getSomatorio() {
		return somatorio;
	}
	public void setSomatorio(int somatorio) {
		this.somatorio =+ somatorio; //ATENÇÃO**
	}
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
	/*Imprimir todos os elementos do vetor
	Mostrar na tela a soma(ATENÇÃO**) e a média dos elementos do vetor */
	public void imprimirVetor(int[] vetor) {
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			setSomatorio(vetor[i]);
			System.out.println(vetor[i]);
		}
		setMediaDosItens((getSomatorio()/getQuantidade_Numeros()));//aqui é realizado a media = somatorio dividido pela qtd de Itens.
	}
	
	
}