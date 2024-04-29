import java.util.Scanner;
import Entidades.GuessGame;
public class gameMain {
	public static void main(String[] args) {
		
		System.out.println("JOGO ADIVINHACAO");
		Scanner scan = new Scanner(System.in);
		GuessGame game = new GuessGame(); 
		//n�o � necessario usar um construtor com parametros 
		//porque n�o estamos lidando com um sistema que precisa verificar os armazenamentos antes de possuir algo armazenado.
		
		game.numRandom();
		// gerando um numero aleatorio usando a fun��o math random.
		
		System.out.print("Tente adivinhar o numero que estou pensando 0 a 10"
				+ "\nInforme seu Palpite:");
		do{
			game.numInConjunt(scan.nextInt()); 
			//leitura do palpite do player.
			//verificando se o numero est� dentro do intervalo 0 e 10.
			game.comparation();
			//realizando a compara��o e informando se o numero �
			//maior ou menor que o computador est� "pensando". 
		}while( game.getGuess() != game.getNumber());
		
		System.out.println("PARABENS, ACERTOU!!!!");
	
		scan.close();
	}
}
