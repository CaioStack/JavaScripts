// Prática 03 — if, else if, else, ternário e boas práticas

// 1. Verificação de idade
// Leia uma idade e informe se a pessoa é criança, adolescente, adulta ou idosa.
// Utilize: if, else if, else, int e Scanner.

// 2. Maior de dois números
// Leia dois números e informe qual é o maior ou se são iguais.
// Utilize: if, else if, else e operadores relacionais.

// 3. Situação de aluno
// Leia duas notas e calcule a média. Informe se o aluno foi aprovado,
// ficou de recuperação ou foi reprovado.
// Além disso, mostre uma mensagem curta usando operador ternário.
// Utilize: if, else if, else, ternário, double e Scanner.
// Mantenha boa indentação e uso consistente de chaves.

package br.edu.principal;

import java.util.Scanner;

public class pratica03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1.
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade <= 12){

			System.out.println("Você é uma criança.");
			
		} else if (idade <= 17){
			
			System.out.println("Você é um adolescente.");
			
		} else if (idade <= 59) {
			
			System.out.println("Você é um adulto.");
			
		} else {
			
			System.out.println("Você é um idoso.");
			
		}
		
		// 2.
		
		System.out.println("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.println(n1 + " é maior que " + n2);
		} else if (n2 > n1) {
			System.out.println(n2 + " é maior que " + n1);
		} else {
			System.out.println("Os números são iguais.");
		}
		
		// 3.
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.println("Você foi aprovado direto!");
		} else if (media >= 3) {
			System.out.println("Você ficou de recuperação!");
		} else {
			System.out.println("Você foi reprovado direto!");
		}
		
		String msg = (media >= 6) ? "Ótimo aluno!" : "Pode melhorar!" ;
		System.out.println(msg);
		
	}

}






































