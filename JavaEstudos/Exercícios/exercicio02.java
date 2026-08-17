/* Exercício 02 - referente à aula 02 (Variáveis, Tipos e Operadores)
 *
 * Tarefas:
 * 
 * 1) Declare variáveis para: seu nome (String), idade (int), altura
 *    (double) e se você gosta de programar (boolean). Imprima todas.
 * 2) Crie duas variáveis int (a e b) com valores de sua escolha e
 *    imprima o resultado de TODOS os operadores aritméticos entre
 *    elas (+, -, *, /, %).
 * 3) Crie uma constante (final) chamada IMPOSTO com valor 0.15
 *    (15%) e calcule quanto de imposto incide sobre um valor de
 *    R$ 200.00, imprimindo o resultado.
 * 4) Declare uma variável double com um valor decimal (ex: 15.75)
 *    e faça um cast explícito para int, imprimindo o valor ANTES
 *    e DEPOIS da conversão para observar a diferença.
 * 5) Use operadores lógicos (&&, ||, !) para verificar se um número
 *    está entre 10 e 20 (inclusive).
 */

package br.edu.principal;

public class exercicio02 {

	public static void main(String[] args) {
		
        // Tarefa 1 -
		
		String nome = "Caio Salgado Marques";
		int idade = 17;
		double altura = 1.69;
		boolean programacao = true;
		
		System.out.println("Meu nome é " + nome + " eu tenho " + idade + " anos " + "e "
		+ altura + " de altura. Se eu gosto de programação? " + programacao);

        // Tarefa 2 -

		int a = 17;
		int b = 3;
		
		System.out.println("Soma: " + (a + b));
		System.out.println("Subtração: " + (a - b));
		System.out.println("Multiplicação: " + (a * b));
		System.out.println("Divisão: " + (a / b));
		System.out.println("Resto da divisão: " + (a % b));
		
        // Tarefa 3 -

		final double imposto = 0.15;
		double valor = 200.00;
		
		System.out.println("Valor que o imposto de 15% incide sobre R$200,00: " + (valor * imposto));

        // Tarefa 4 -
		
		double valorD = 15.75;
		
		int valorI = (int)valorD;
		
		System.out.println("Valor antes do cast para int: " + valorD);
		System.out.println("Valor depois do cast para int: " + valorI);

        // Tarefa 5 -
		
		int n1 = 11;
		int n2 = 9;
		
		System.out.println("Se 10 está entre 10 e 20: " + (n1 > 10 && n1 <20));
		System.out.println("Se 9 está entre 10 e 20: " + (n2 > 10 && n1 < 20));

	}

}