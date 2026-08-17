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
        
        // 2.
		
		System.out.print("Digite o primeiro número (com vírgula, ex: 5,5): ");
		double n1 = sc.nextDouble();

		System.out.print("Digite o segundo número (inteiro, ex: 2): ");
		int n2 = sc.nextInt();

		System.out.println("\n--- Operações Matemáticas ---");
		System.out.println("Soma: " + (n1 + n2));
		System.out.println("Subtração: " + (n1 - n2));
		System.out.println("Multiplicação: " + (n1 * n2));
		System.out.println("Divisão: " + (n1 / n2));

		// Conversão Implícita (int -> double acontece automaticamente)
		double n2D = n2;

		// Conversão Explícita (double -> int necessita de casting)
		int n1I = (int) n1; // Perde as casas decimais

		System.out.println("\n--- Demonstração de Conversões ---");
		System.out.println("Casting Implícito (int " + n2 + " para double): " + n2D);
		System.out.println("Casting Explícito (double " + n1 + " para int): " + n1I);
		System.out.println("Soma usando o valor convertido (n1I + n2): " + (n1I + n2));
		
		// 3.
		
		String produto = "Computador";
		double preco = 4467.90;
		int quantidade = 1;
		final double TAXA = 0.10; // Constantes em Java costumam ser em maiúsculas

		// Subtotal usando operador de atribuição de multiplicação (*=)
		double subtotal = preco;
		subtotal *= quantidade; 

		double valorTaxa = subtotal * TAXA;

		// Total usando operador de atribuição de soma (+=)
		double total = subtotal;
		total += valorTaxa;

		System.out.println("\n--- Resumo da Compra ---");
		System.out.println("Produto: " + produto);
		System.out.println("Subtotal: R$ " + subtotal);
		System.out.println("Valor da Taxa (10%): R$ " + valorTaxa);
		System.out.println("Total: R$ " + total);

		// Operadores Relacionais (Comparações)
		System.out.println("\n--- Análise de Validade ---");
		boolean totalMaiorQueSubtotal = total > subtotal;
		boolean compraCara = total >= 3000.00;
		boolean temQuantidade = quantidade > 0;

		System.out.println("O total é maior que o subtotal? " + totalMaiorQueSubtotal);
		System.out.println("A compra é considerada cara (> R$ 3000)? " + compraCara);
		System.out.println("Quantidade válida digitada? " + temQuantidade);
		
	}

}