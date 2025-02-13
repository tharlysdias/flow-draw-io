package exercicios;

import java.util.Scanner;

public class OrdenacaoNumeros {

	public static void main(String[] args) {

		// Declara��o das vari�veis
		int A, B, C, I;
		
		// Entradas de dados
		// Instancia o objeto da classe Scanner
		Scanner teclado = new Scanner(System.in);

		// Mostra mensagem solicitando um valor para A
		System.out.print("Digite um valor para A: ");
		A = teclado.nextInt();

		// Mostra mensagem solicitando um valor para B
		System.out.print("Digite um valor para B: ");
		B = teclado.nextInt();

		// Mostra mensagem solicitando um valor para C
		System.out.print("Digite um valor para C: ");
		C = teclado.nextInt();

		// Mostra mensagem solicitando um valor para I
		System.out.print("Digite um valor para I (1, 2 ou 3): ");
		I = teclado.nextInt();

		// Processamento e Sa�da
		// Se I for igual a 1 determina e mostra a ordem crescente dos n�meros
		if (I == 1) {
			if (A < B && A < C) {
				if (B < C) {
					System.out.println("A ordem crescente dos n�meros �: " + A + " - " + B + " - " + C);
				}
				else {
					System.out.println("A ordem crescente dos n�meros �: " + A + " - " + C + " - " + B);
				}
			}

			if (B < A && B < C) {
				if (A < C) {
					System.out.println("A ordem crescente dos n�meros �: " + B + " - " + A + " - " + C);
				}
				else {
					System.out.println("A ordem crescente dos n�meros �: " + B + " - " + C + " - " + A);
				}
			}
			
			if (C < A && C < B) {
				if (A < B) {
					System.out.println("A ordem crescente dos n�meros �: " + C + " - " + A + " - " + B);
				}
				else {
					System.out.println("A ordem crescente dos n�meros �: " + C + " - " + B + " - " + A);
				}
			}
		}
		
		// Se I for igual a 2 determina e mostra a ordem decrescente dos n�meros
		if (I == 2) {
			if (A > B && B > C) {
				if (B > C) {
					System.out.println("A ordem decrescente dos n�meros �: " + A + " - " + B + " - " + C);
				}
				else {
					System.out.println("A ordem decrescente dos n�meros �: " + A + " - " + C + " - " + B);
				}
			}
			
			if (B > A && B > C) {
				if (A > C) {
					System.out.println("A ordem decrescente dos n�meros �: " + B + " - " + A + " - " + C);
				}
				else {
					System.out.println("A ordem decrescente dos n�meros �: " + B + " - " + C + " - " + A);
				}
			}
			
			if (C > A && C > B) {
				if (A > C) {
					System.out.println("A ordem decrescente dos n�meros �: " + C + " - " + B + " - " + A);
				}
				else {
					System.out.println("A ordem decrescente dos n�meros �: " + C + " - " + A + " - " + B);
				}
			}
		}
		
		// Se I for igual a 3 mostra o maior n�mero entre os demais
		if (I == 3) {
			if (A > B && A > C) {
				System.out.println("A ordem desejada �: " + B + " - " + A + " - " + C);
			}
			if (B > A && B > C) {
				System.out.println("A ordem desejada �: " + A + " - " + B + " - " + C);
			}
			if (C > A && C > B) {
				System.out.println("A ordem desejada �: " + A + " - " + C + " - " + B);
			}
		}
		
		teclado.close();
	}
}
