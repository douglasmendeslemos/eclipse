package Entidades;

import java.util.Scanner;

/*
 *1. problema altura
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura m�dia das pessoas, e mostrar tamb�m a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
*/
/*
2. problema Mais Velho
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.

3. problema aprovados
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1� e 2� semestres. Cada uma dessas informa��es deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja m�dia das notas seja maior ou
igual a 6.0 (seis).

4. problema dados pessoas
Tem-se um conjunto de dados contendo a altura e o g�nero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a m�dia de altura das mulheres, e o n�mero
de homens.
*/
public class realsProblems {
	
	metodosVetores vet = new metodosVetores();
	
	private Scanner scan;
	private String[] namePerson;
	private int[] yearOld;
	private double[] tallOfPerson;
	
	public void problemTall() {
		vet.askQtdNumbers();
		redingInfo();
	}
	
	public void redingInfo() {
		scan = new Scanner(System.in);
		
		this.namePerson = new String[vet.getQuantidade_Numeros()];
		this.yearOld = new int[vet.getQuantidade_Numeros()];
		this.tallOfPerson = new double[vet.getQuantidade_Numeros()];
		
        for (int i = 0; i < vet.getQuantidade_Numeros(); i++) {
            System.out.print("Digite o nome da " +(i+1)+ "� pessoa:");
			namePerson[i]= scan.next(); //verificar por que na segunda rodada do vertor o array n�o l�
			System.out.print("Informe a idade:");
			yearOld[i] = scan.nextInt();
			System.out.print("Informe a Altura: ");
			tallOfPerson[i] = scan.nextDouble();
			
        }
    }
	
	
	
	
	
}
