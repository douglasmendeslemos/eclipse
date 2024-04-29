package Entidades;

import java.util.Scanner;

public class GuessGame {
	
	private int number;
	
	private int guess;
	
	Scanner sc = new Scanner(System.in);
	//ENCAPSULAMENTO
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setGuess(int guess) {
		this.guess = guess;
	}
	
	public int getGuess() {
		return guess;
	}
	
	// gerando um numero aleatório
	public int numRandom() {
		setNumber((int)(Math.random() * 10));
		//passando o numero double para int e multi
		return getNumber();
	}
	
	//verificar se o numero está dentro do intervalo
	public void numInConjunt (int number) {
	    	if( number < 0 || number > 10) {
	    		System.out.print("digite um numero entre 0 e 10:");
	    		numInConjunt(sc.nextInt());
	    	} else
	    		setGuess(number);
	}
	
	//Informar seo numero está correto ( maior ou menor )
	public void comparation() {
		if(getNumber() < getGuess()) {
			System.out.println("O numero informado eh maior do que eu estou pensando");
			System.out.print("Tente novamente:");
		}
		if(getNumber() > getGuess()) {
			System.out.println("O numero informado eh menor do que eu estou pensando");
			System.out.print("Tente novamente:");
		}
		
		//Permitir que o player faça palpites
		/*CONSTRUTOR
		public GuessGame(int guess) {
			setGuess(guess);
		}
		//CONSTRUTOR PADRÃO
		public GuessGame() {
			
		}*/
	}
	
}
	