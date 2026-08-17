// Aula 01 - 11.08.2026

package br.edu.principal;

import java.util.Scanner;

public class aula01 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita o nome: ");
		String nome = sc.next();
		
		System.out.println("Seu nome: " + nome);
		
		System.out.println("Digite a N1: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("Digite a N2: ");
		
		double n2 = sc.nextDouble();
		
		System.out.println("Olá " + nome + " sua média é: " + (n1+n2) / 2);
		
	}

}