/* Exercício 04 - referente à Aula 04 (Estruturas de Repetição)
 *  
 * Tarefas:
 *
 * 1) Use um for para imprimir todos os números pares de 1 a 50.
 * 2) Use um while para somar todos os números de 1 a 100 e
 *    imprima o resultado final (deve dar 5050).
 * 3) Use um do-while para simular uma contagem regressiva de 10 até 0,
 *    imprimindo "Fogo!" no final.
 * 4) Usando break, faça um loop de 1 a 100 que pare assim que
 *    encontrar o primeiro número divisível por 7 E por 3 ao mesmo tempo.
 * 5) Usando loops aninhados, imprima um "triângulo" de asteriscos:
 *    *
 *    **
 *    ***
 *    ****
 *    *****
 *    (5 linhas, cada linha com uma quantidade crescente de *)
 * ============================================================
 */

package br.edu.principal;

public class exercicio04 {

	public static void main(String[] args) {
		
        // Tarefa 1 -
		
		for (int i = 1; i <= 50; i++) {
			
			if (i % 2 == 0) {
				
				//System.out.println("Número: " + i);
				
			}
			
		}
		
		
        // Tarefa 2 -
		
		int soma = 0;
		int i = 1;
		
		while (i <=100) {
			soma += i;
			i++;
		}
		
		System.out.println("A soma dos números entre 1 e 100 é: " + soma);
		
		// TODO : Tarefa 3 -
		
		
		// TODO : Tarefa 4 -
		
		
		// TODO : Tarefa 5 -

	}

}

























