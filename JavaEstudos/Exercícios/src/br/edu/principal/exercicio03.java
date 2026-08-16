/* Exercício 03 - referente à Aula 03 (Estruturas Condicionais)
 * 
 * Tarefas:
 * 
 * 1) Peça (simule com uma variável) uma nota de 0 a 10 e, usando
 *    if/else if/else, imprima o conceito: >=9 "Excelente", >=7
 *    "Bom", >=5 "Regular", abaixo disso "Insuficiente".
 * 2) Usando o operador ternário, verifique se um número é positivo,
 *    negativo ou zero (dica: pode precisar de ternário aninhado).
 * 3) Crie um switch (tradicional OU moderno) que receba um número de
 *    1 a 12 e imprima o nome do mês correspondente.
 * 4) Verifique se uma pessoa pode entrar em uma balada usando
 *    condições compostas: precisa ter 18 anos OU MAIS e estar com
 *    documento (boolean temDocumento = true/false).
 * ============================================================
 */

package br.edu.principal;

public class exercicio03 {

	public static void main(String[] args) {
		
        // Tarefa 1 -
		
        double nota = 8.5;
        
        if (nota >= 9){
        	System.out.println("Excelente");
        } else if (nota >=7) {
        	System.out.println("Bom");
        } else if (nota >=5) {
        	System.out.println("Regular");
        } else {
        	System.out.println("Insuficiente");
        }

        // Tarefa 2 -
        
        int num = -5;
        
        String numV = (num >= 0) ? "Positivo" : (num == 0) ? "Nulo" : "Negativo";
        System.out.println("O numero " + num + " é " + numV);
        
        // Tarefa 3 -
        
        int mes = 5;

        String diaMes = switch (mes) {
        
        case 1 -> "Janeiro";
        case 2 -> "Fevereiro";
        case 3 -> "Março";
        case 4 -> "Abril";
        case 5 -> "Maio";
        case 6 -> "Junho";
        case 7 -> "Julho";
        case 8 -> "Agosto";
        case 9 -> "Setembro";
        case 10 -> "Outubro";
        case 11 -> "Novembro";
        case 12 -> "Dezembro";
        default -> "Mês inválido";
        
        };
        
        System.out.println("O mês " + mes + " corresponde a: " + diaMes);

        // Tarefa 4 -
        
        int idade = 19;
        boolean documento = false;
        
        if (idade >= 18 && documento) {
        	System.out.println("Pode entrar");
        } else if (idade < 18 && documento) {
        	System.out.println("Não tem idade suficiente");
        } else if (idade >= 18 && documento == false) {
        	System.out.println("Não tem documento");
        } else {
        	System.out.println("Não tem idade e nem documento");
        }

	}

}