package aula01;

import java.util.Scanner;

public class Exercicio1_maiorMenor {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		preencher(vetor);
		int maior = maiorValor(vetor);
		int menor = menorValor(vetor);
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
	}

	public static void preencher(int[] vetor) {
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = keyboard.nextInt();
		}
		keyboard.close();
	}
	
	public static int maiorValor(int[] vetor) {
		int aux = vetor[0];
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i] > aux) {
				aux = vetor[i];
			}
		}
		return aux;
	}
	
	public static int menorValor(int[] vetor) {
		int aux = vetor[0];
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i] < aux) {
				aux = vetor[i];
			}
		}
		return aux;
	}
	
	
}
