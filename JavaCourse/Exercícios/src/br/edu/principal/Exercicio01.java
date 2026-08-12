// Exercício 01 - Referente apenas a conteúdos da Aula01 + Scanner

/* Exercício: Sistema de Controle de Presença e Matrícula

Uma escola de idiomas precisa de um programa que controle a matrícula de uma turma com no máximo 5 vagas.

O programa deve pedir ao usuário o nome do curso, o valor da mensalidade e se o curso está ativo.
Em seguida, deve coletar os dados de 5 candidatos: nome, idade e se já pagaram a matrícula.
Um candidato só pode ser matriculado se tiver 16 anos ou mais e já ter pago a matrícula,
os que não atenderem aos critérios devem gerar uma mensagem informando o motivo (idade insuficiente, pagamento pendente, ou ambos).
Ao final da coleta, o programa deve informar quantas vagas foram preenchidas e quantas ainda restam.
O primeiro aluno matriculado teve a matrícula cancelada por motivo administrativo e deve ser removido.
Depois da remoção, o programa deve listar os matriculados restantes, numerados, e informar quantos sobraram.
Por fim, deve exibir um resumo com: nome do curso, valor da mensalidade, se está ativo, a primeira letra do nome do curso e a quantidade final de matriculados. */

package br.edu.principal;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		   System.out.println("Digite o nome do curso: ");
		   String curso = sc.next();
		   
		   System.out.println("Digite o valor da mensalidade: ");
		   String valor = sc.next();
		   
		   System.out.println("Digite se o curso está ativo(Sim/Não): ");
		   String ativo = sc.next();
		   
		   System.out.println("Digite o nome do 1° candidato: ");
		   String nome1 = sc.next();
		   
		   System.out.println("Digite a idade do 1° candidato: ");
		   int idade1 = sc.nextInt();
		   
		   System.out.println("Digite a situação de matrícula do 1° candidato(Pago/Não pago): ");
		   String matricula1 = sc.next();
		   
		   System.out.println("Digite o nome do 2° candidato: ");
		   String nome2 = sc.next();
		   
		   System.out.println("Digite a idade do 2° candidato: ");
		   int idade2 = sc.nextInt();
		   
		   System.out.println("Digite a situação de matrícula do 2° candidato(Pago/Não pago): ");
		   String matricula2 = sc.next();
		   
		   System.out.println("Digite o nome do 3° candidato: ");
		   String nome3 = sc.next();
		   
		   System.out.println("Digite a idade do 3° candidato: ");
		   int idade3 = sc.nextInt();
		   
		   System.out.println("Digite a situação de matrícula do 3° candidato(Pago/Não pago): ");
		   String matricula3 = sc.next();
		   
		   System.out.println("Digite o nome do 4° candidato: ");
		   String nome4 = sc.next();
		   
		   System.out.println("Digite a idade do 4° candidato: ");
		   int idade4 = sc.nextInt();
		   
		   System.out.println("Digite a situação de matrícula do 4° candidato(Pago/Não pago): ");
		   String matricula4 = sc.next();
		   
		   System.out.println("Digite o nome do 5° candidato: ");
		   String nome5 = sc.next();
		   
		   System.out.println("Digite a idade do 5° candidato: ");
		   int idade5 = sc.nextInt();
		   
		   System.out.println("Digite a situação de matrícula do 5° candidato(Pago/Não pago): ");
		   String matricula5 = sc.next();

	}

}
