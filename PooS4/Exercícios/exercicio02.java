// Exercício 02 - 18.08.2026

package br.edu.principal;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7:");
		int dia = sc.nextInt();
		
		// Usando if - else if
		
		if (dia == 1) {
			
			System.out.println("Domingo");
			
		} else if (dia == 2) {
			
			System.out.println("Segunda");
			
		} else if (dia == 3) {
			
			System.out.println("Terça");
			
		} else {
			
			System.out.println("Esse dia não existe!");
			
		}
		
		// Usando switch case (antigo)
		
		switch(dia) {
		
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			default:
				System.out.println("Esse dia não existe!");
		
		}
		
		// Usando switch case (moderno)
		
		switch(dia) {
		
			case 1 -> System.out.println("Domingo");
			case 2 -> System.out.println("Segunda");
			case 3 -> System.out.println("Terça");
			
			default -> System.out.println("Esse dia não existe!");
		
		}

	}

}
