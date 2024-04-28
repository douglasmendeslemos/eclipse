package Entidades;

public class GuessGame {
	
	private int number;
	
	private int guess;
	
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
	
	// gerar um numero aleatório
	
	public int numRandom() {
		setNumber((int)(Math.random() * 11));
		return getNumber();
	}
	
	//Permitir que o player faça palpites
	/*CONSTRUTOR
	public GuessGame(int guess) {
		setGuess(guess);
	}
	//CONSTRUTOR PADRÃO
	public GuessGame() {
		
	}*/
	
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
	}
	
}
	