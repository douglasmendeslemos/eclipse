import java.util.Scanner;
import Entidades.GuessGame;
public class gameMain {
	public static void main(String[] args) {
		System.out.println("JOGO ADIVINHACAO");
		Scanner scan = new Scanner(System.in);
		GuessGame game = new GuessGame(); //não é necessario usar um construtor com parametros porque não estamos lidando com um sistema que pode verificar os armazenamentos antes de possuir algo armazenado.
		 game.numRandom();// gerando um numero aleatorio usando a função math random.
		 System.out.println("Tente adivinhar o numero que estou pensando 0 a 10");
		 System.out.print("Informe seu Palpite:");
		do {
		game.setGuess(scan.nextInt()); //leitura do palpite do player.
		game.comparation();
		}while( game.getGuess() != game.getNumber());
		 System.out.println("PARABENS, ACERTOU!!!!");
		 scan.close();
	}
}
