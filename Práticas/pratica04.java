// Prática 04 — switch tradicional e switch moderno com arrow

// 1. Menu simples
// Crie um menu com quatro opções numéricas e mostre uma mensagem correspondente.
// Utilize: switch tradicional, case, break e Scanner.

// 2. Dia da semana
// Leia um número de 1 a 7 e informe o dia correspondente.
// Trate também uma opção inválida.
// Utilize: switch tradicional e default.

// 3. Sistema de escolha
// Crie um menu para escolher uma operação do sistema usando textos (String) ou  letras (char) (Ex: "A" para Ajuda).
// Implemente a mesma lógica de escolha dos exercícios anteriores, mas use a nova sintaxe do Java para deixar o código limpo.
// Utilize: obrigatoriamente o switch moderno com arrow (->), case, default e Scanner. Não utilize o comando break.

package br.edu.principal;

import java.util.Scanner;

public class pratica04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// 1.
		
		System.out.println("-- Menu --");
		System.out.println("Opção 1: Computador");
		System.out.println("Opção 2: Celular");
		System.out.println("Opção 3: Mouse");
		System.out.println("OPção 4: Teclado");
		
		System.out.println("");
		System.out.println("Escolha uma opção (1,2,3 ou 4):");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		
			case 1:
				System.out.println("Opção 1 refere-se a computador");
				break;
			case 2:
				System.out.println("Opção 2 refere-se a celular");
				break;
			case 3:
				System.out.println("Opção 3 refere-se a mouse");
				break;
			case 4:
				System.out.println("Opção 4 refere-se a teclado");
				break;
			default:
				System.out.println("Opção inválida");
		
		}
		
		// 2.
		
		System.out.println("Escolha um número referente a semana (1 : Domingo ... 7 : Sábado)");
		int dia = sc.nextInt();
		
		switch(dia) {
		
		case 1:
			System.out.println("Domingo refere-se ao dia 1 da semana");
			break;
		case 2:
			System.out.println("Segunda refere-se ao dia 2 da semana");
			break;
		case 3:
			System.out.println("Terça refere-se ao dia 3 da semana");
			break;
		case 4:
			System.out.println("Quarta refere-se ao dia 4 da semana");
			break;
		case 5:
			System.out.println("Quinta refere-se ao dia 5 da semana");
			break;
		case 6:
			System.out.println("Sexta refere-se ao dia 6 da semana");
			break;
		case 7:
			System.out.println("Sábado refere-se ao dia 7 da semana");
			break;
		default:
			System.out.println("Esse dia não existe!");
	
		}
		
		// 3.
		
		System.out.println("-- Menu -- ");
		System.out.println("A - Áustria");
		System.out.println("B - Bolívia");
		System.out.println("C - Croácia");
		System.out.println("D - Dinamarca");
		System.out.println("E - Escócia");
		
		System.out.println("Escolha um país(digite a letra respectiva): ");
		
		
		// .toUpperCase() garante que funcione mesmo se digitarem 'a' minúsculo
		String letra = sc.next().toUpperCase();
		
		String país = switch(letra) {
		
		case "A" -> "Áustria";
		case "B" -> "Bolívia";
		case "C" -> "Croácia";
		case "D" -> "Dinamarca";
		case "E" -> "Escócia";
		
		default -> "Letra inválida!";
		
		};
		
		System.out.println("A letra " + letra + " refere-se ao país " + país);
		
	}
}



















