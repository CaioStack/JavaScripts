// Prática 02 — Variáveis, tipos primitivos, casting, operadores, final, String e Scanner

// 1. Cadastro básico
// Crie um pequeno cadastro solicitando ao usuário nome, idade, altura, uma inicial do nome
// e se ele gosta de Java. Exiba todas as informações.
// Utilize: Scanner, String, int, double, char, boolean e println().

// 2. Operações e conversões
// Leia dois valores numéricos do usuário, realize operações matemáticas entre eles
// e depois faça uma conversão implícita e outra explícita.
// Utilize: Scanner, int, double, casting implícito e explícito, operadores aritméticos.

// 3. Pequeno sistema de compra
// Crie um produto com nome, preço e quantidade. Defina uma taxa fixa como constante.
// Calcule subtotal, valor da taxa e total, e faça comparações envolvendo os valores.
// Utilize: String, int, double, final, operadores aritméticos, relacionais e de atribuição.

package br.edu.principal;

import java.util.Scanner;

public class pratica02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// 1.
		
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Digite sua altura (ex: 1,79): ");
		double altura = sc.nextDouble();
		
		System.out.println("Digite uma inicial do seu nome: ");
		char inicial = sc.next().charAt(0); // next usado no char
		
		System.out.print("Você gosta de Java? (true/false): ");
        boolean gostaJava = sc.nextBoolean();
		
        System.out.println("\n--- Dados Cadastrados ---"); // O caractere \n representa uma quebra de linha (uma linha em branco).
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Gosta de Java? " + gostaJava);

		// 2 e 3 - fazendo

	}

}
