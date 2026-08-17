// Exercício 01 - 17.08.2026

package br.edu.principal;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
		
        System.out.print("Informe o Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Informe o Número: ");
        String numero = scanner.nextLine();

        System.out.print("Informe o Bairro: ");
        String bairro = scanner.nextLine();

        System.out.print("Informe o Complemento: ");
        String complemento = scanner.nextLine();

        System.out.print("Informe o CEP: ");
        String cep = scanner.nextLine();

        System.out.print("Informe a Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Informe a UF: ");
        String uf = scanner.nextLine();

        System.out.print("Informe o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Informe a Data de Nascimento (xx/xx/xxxx): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Informe a Idade: ");
        int idade = scanner.nextInt();

        // Impressão no formato solicitado
        
        System.out.println("Nome : " + nome);
        System.out.println("Endereço : " + rua + ", " + numero + ", " + bairro + ", " + complemento + ", " + cep + ", " + cidade + " - " + uf);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimeto: " + dataNascimento);
        System.out.println("Idade: " + idade);

    }
}