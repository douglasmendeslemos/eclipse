package Entidades;

import java.util.Scanner;

public class metodosVetores {
	protected double quantidade_Numeros;
	private double mediaArray;
	private int somatorio;	
	private Scanner scan;//criando uma variavel scanner.
	private int[] array;
	private int[] arrayB;
	private int[] arrayC;

	//Encapsulamentos.
	public double getMediaArray() {
		return mediaArray;
	}
	public void setMediaArray(double mediaArray) {
		this.mediaArray = mediaArray;
	}
	public int getSomatorio() {
		return somatorio;
	}
	public void setSomatorio(int somatorio) {
		this.somatorio = somatorio;
	}
	public double getQuantidade_Numeros() {
		return quantidade_Numeros;
	}
	public void setQuantidade_Numeros(double number) {
		this.quantidade_Numeros = number;
	}
	
	
	//Leitura do tamanho do vetor.
	public void askQtdNumbers() {
        scan = new Scanner(System.in);//inicializa��o da variavel scanner.
        System.out.print("Quantos n�meros informa��o pretende digitar? ");
        double quantidade = scan.nextInt();
        setQuantidade_Numeros(quantidade);
    }
	//Leitura dos numeros.
	public void redingNumber() {
        array = new int[ (int)getQuantidade_Numeros()];
        for (int i = 0; i < getQuantidade_Numeros(); i++) {
            System.out.print("Digite um n�mero: ");
            array[i] = scan.nextInt();
        }
    }
	//metodo para imprimir numeros negativos.
	public void printNegativeNumbers() {
		System.out.print("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			if( this.array[i] < 0) {
				System.out.print(this.array[i] + " ");
			}
		}
	}
	//Imprime todos os elementos do vetor
	public void printArray(String[] vetor) {
		System.out.print("VALORES : ");
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	public void printArray(int[] vetor) {
		System.out.print("VALORES : ");
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	//realiza o somatorio do vetor
	//Alterando a fun��o para receber um vetor. double e int
	public int functionSomatorio(double[] vetor) {
		int var = 0;
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			var += vetor[i];
		}
		setSomatorio(var);
		return getSomatorio();
	}
	public int functionSomatorio(int[] vetor) {
		int var = 0;
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			var += vetor[i];
		}
		setSomatorio(var);
		return getSomatorio();
	}
	//media dos valores do vetor.
	public double calcMediaArray(int[] vetor) {
		double var =	(functionSomatorio(vetor) / getQuantidade_Numeros());
		setMediaArray(var);
		return getMediaArray();
	}
	public double calcMediaArray(double [] vetor) {
		double var =	(functionSomatorio(vetor) / getQuantidade_Numeros());
		setMediaArray(var);
		return getMediaArray();
	}
	//verificar os numeros pares, imprimir e infomar quantos numeros pares tem.
	public void numbersEvens() {
		System.out.print("Numeros Pares: ");
		int var = 0, var2 = 0;
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			if(this.array[i] % 2 == 0) {
				System.out.print(this.array[i] + " ");
				var++;
				var2 = i;
			}
		}
		if(var == 0 && var2 == getQuantidade_Numeros()-1 ) {
			System.out.print("\nN�o tem Numeros Pares!");
		}else
			System.out.print("\nQuantidade de Numeros Pares: " + var);
	}
	
	//verificar maior valor em um vetor (n�o tem numeros iguais) e informar o valor e posi��o
	public void bigPosition() {
		int bigNumber = 0;
		int position = 0;
		for(int i = 0; i < getQuantidade_Numeros(); i++) {
			if(this.array[i] > bigNumber) {
				bigNumber = this.array[i];
				position = i;
			}
		}
		System.out.println("Maior Valor: " + bigNumber);
		System.out.println("Posicao do Maior Valor	: " + position);
	}
	
	//Somar dois vetores e imprimir o vetor resultando
	public void joinArray() {
		askQtdNumbers();
		
		System.out.println("Informe o primeiro vetor:");
		redingNumber();
		this.arrayB = this.array.clone();

		System.out.println("Informe o segundo vetor:");
		redingNumber();
		this.arrayC = this.array.clone();
		System.out.print("VETOR RESULTANTE ");
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			array[i] = arrayB[i] + arrayC[i];
		}
		printArray(array);
		scan.close();//fechamento do scanner
	}
	//calcular a media dos valores do vetor
	//verificar os numeros abaixo da media
	public void numberMediaLow() {
		//functionSomatorio(this.array); 
		calcMediaArray(this.array);
		System.out.println("Media do Vetor: "+getMediaArray());
		System.out.print("Valores abaixo da media: ");
		for (int i = 0; i < array.length; i++) {
			if(array[i] < getMediaArray()) {
				System.out.print(array[i] +" ");
			}
		}
	}
	
	//calcular a media dos valores pares do vetor
	//verificar os numeros que est�o abaixo da media.
	public void numberEvenLow() {
		int var = 0; //variavel para verificar quantidade de numeros existe no array
		this.arrayB = new int[(int)getQuantidade_Numeros()];
		for (int i = 0; i < getQuantidade_Numeros(); i++) {
			if(this.array[i] % 2 == 0) {
				this.arrayB[var] = this.array[i]; 
				var++;
			}
		}
		this.array = this.arrayB.clone();
		//functionSomatorio(this.array);
		if(var == 0)
			System.out.print("Nenhum Numero Par!");
		else {
			setMediaArray( getSomatorio() / var );//divis�o da soma dos numeros pares pela qtd de numeros pares.
			System.out.println("Media dos numeros pares: "+ getMediaArray());
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
}