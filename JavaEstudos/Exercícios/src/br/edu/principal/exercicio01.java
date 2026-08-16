/* Exercício 01 - referente à Aula 01 (Introdução ao Java)
 * 
 * Objetivo: praticar System.out.println/print, comentários e
 * concatenação de texto.
 *
 * Tarefas:
 * 
 * 1) Imprima seu nome completo em uma linha.
 * 2) Imprima sua idade e o ano atual em linhas separadas.
 * 3) Usando UMA única linha de código (com print, sem println),
 *    imprima "Estou " seguido de "aprendendo Java!" na MESMA linha
 *    de saída (ou seja, use dois print() seguidos).
 * 4) Calcule e imprima quantos anos você terá em 2030, usando uma
 *    expressão matemática dentro do println (ex: idade + (2030 - anoAtual)).
 * 5) Escreva um comentário de bloco explicando o que é a JVM,
 * 	  com suas próprias palavras.
 */

package br.edu.principal;

public class exercicio01 {

	public static void main(String[] args) {
		
        // Tarefa 1
		
		System.out.println("Meu nome é Caio Salgado Marques!");


        // Tarefa 2
		
		System.out.println("Minha idade é de 17 anos");
		System.out.println("O ano atual é 2026");


        // Tarefa 3
		
		System.out.print("Estou "); System.out.print("aprendendo Java!");


        // Tarefa 4
		
		System.out.println(); // só pra pular uma linha do devido a tarefa 3
		System.out.println("Em 2030 eu terei " + (2030-2009) + (" anos!"));


        // Tarefa 5
		
		/*
		A JVM (Java Virtual Machine) é um programa que roda no seu computador.
		Ela lê e executa códigos feitos em Java. Ela funciona como um tradutor.
		O código Java vira uma linguagem universal que a JVM entende e transforma
		para o seu sistema operacional.
		*/

	}

}