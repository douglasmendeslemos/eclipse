import java.util.Scanner;

public class numNegative {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos numeros pretende digitar?");
		int n = scan.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero:");
			array[i] = scan.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS");
		for (int i = 0; i < n; i++) {
			if( array[i] < 0) {
				System.out.println(array[i]);
			}
		}
		
		
		scan.close();
	}
	
}
