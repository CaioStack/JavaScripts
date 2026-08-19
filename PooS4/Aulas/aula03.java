// Aula 03 - 18.08.2026
package br.edu.principal;

import java.util.Scanner;

public class aula03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digita o nome: ");
        String nome = sc.next();
        System.out.println("Seu nome: " + nome);
        
        System.out.println("Digite a N1: ");
        double n1 = sc.nextDouble();
        
        System.out.println("Digite a N2: ");
        double n2 = sc.nextDouble();
        
        double media = (n1 + n2) / 2;
        System.out.println("Olá " + nome + " sua média é: " + media);
        
        String situacao = "";
        double mf = 0; // Declarada aqui para ter escopo global no método

        if (media >= 6) {
        	
            situacao = "Aprovado!";
            
            System.out.println("Situação: " + situacao);
            
        } else if (media >= 3) {
        	
            situacao = "Está de avaliação final.";
            
            System.out.println("Situação: " + situacao);
            
            System.out.println("Digite a nota da avaliação final:");
            
            double af = sc.nextDouble();
            
            mf = (af + media) / 2;
            
            if (mf >= 5) {
            	
                System.out.println("Aprovado na Final! Média final: " + mf);
                
            } else {
            	
                System.out.println("Reprovado na Final! Média final: " + mf);
                
            }
            
        } else {
        	
            situacao = "Reprovado direto!";
            
            System.out.println("Situação: " + situacao);
            
        }
        
    }
}