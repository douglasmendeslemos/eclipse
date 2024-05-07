package Entidades;

import java.util.Scanner;

/*
 *1. problema altura
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
*/
/*
2. problema Mais Velho
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.

3. problema aprovados
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).

4. problema dados pessoas
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
*/
public class realsProblems {
	
	metodosVetores vet = new metodosVetores();
	
	private Scanner scan;
	private String[] namePerson;
	private int[] yearsOld;
	private double[] tallOfPerson;
	
	public void problemTall() {
		vet.askQtdNumbers();
		redingInfo();
		vet.functionSomatorio(tallOfPerson);
		vet.calcMediaArray(tallOfPerson);
		System.out.println("Media da altura das pessoas: " + vet.getMediaArray());
		System.out.println("Porcentagem das pessoas <16: " + percentYearsOld());
	}
	public double percentYearsOld() {
		int var = 0;
		for (int i = 0; i < this.yearsOld.length; i++) {
			if(this.yearsOld[i] < 16) {
				var++;
			}
		}
		double qtd = var*100/(double) this.yearsOld.length;
		return qtd;
	}
	
	public void redingInfo() {
		scan = new Scanner(System.in);
		
		this.namePerson = new String[(int )vet.getQuantidade_Numeros()];
		this.yearsOld = new int[(int) vet.getQuantidade_Numeros()];
		this.tallOfPerson = new double[ (int)vet.getQuantidade_Numeros()];
		
        for (int i = 0; i < vet.getQuantidade_Numeros(); i++) {
            System.out.print("Digite o nome da " +(i+1)+ "º pessoa:");
			namePerson[i]= scan.next(); //verificar por que na segunda rodada do vertor o array não lê
			System.out.print("Informe a idade:");
			yearsOld[i] = scan.nextInt();
			System.out.print("Informe a Altura: ");
			tallOfPerson[i] = scan.nextDouble();
			
        }
    }
	
	
	
	
	
}
