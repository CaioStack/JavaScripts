/* Aula 01 - Introdução ao java
 * 
 * Conteúdos desta aula:
 * 
 *  1) O que é Java e como ele funciona (JDK, JRE, JVM)
 *  2) Estrutura básica de um programa Java
 *  3) O método main() - ponto de entrada do programa
 *  4) System.out.println() e System.out.print()
 *  5) Comentários no código
 *  
 * Teoria:
 * 
 * - JDK (Java Development Kit): pacote completo para DESENVOLVER em Java.
 *   Contém o compilador (javac), a JVM e bibliotecas.
 * - JRE (Java Runtime Environment): necessário apenas para RODAR programas Java.
 * - JVM (Java Virtual Machine): a "máquina virtual" que executa o bytecode
 *   (.class) gerado pelo compilador. É por isso que Java é multiplataforma:
 *   "escreva uma vez, rode em qualquer lugar" (Write Once, Run Anywhere).
 *
 * Fluxo: código-fonte (.java) --[javac compila]--> bytecode (.class)
 *        --[JVM interpreta/executa]--> programa rodando
 *        
 */

    // O método main() é o PONTO DE ENTRADA de qualquer aplicação Java.
    // A JVM procura exatamente esta assinatura para começar a executar o programa:
    // public   -> pode ser chamado de fora da classe (a JVM precisa acessá-lo)
    // static   -> pertence à classe, não a um objeto (não precisamos criar
    //             um objeto "aula01" para rodar o programa)
    // void     -> não retorna nenhum valor
    // main     -> nome fixo, reconhecido pela JVM
    // (String[] args) -> vetor de argumentos que podem ser passados via linha
    //                     de comando ao executar o programa

package br.edu.principal;

//Toda classe pública "NomeClasse" deve ficar em um arquivo "NomeClasse.java"

public class aula01 {

	public static void main(String[] args) {
		
		// System.out é um objeto que representa a "saída padrão" (o console).
        // println() imprime o texto e PULA para a próxima linha depois.
		
		System.out.println("Olá, Mundo!");
		
		// print() imprime o texto e NÃO pula linha (o próximo print continua
        // na mesma linha).
		
		System.out.print("Este texto ");
		System.out.print("fica na mesma linha.");
		
		System.out.println(); // println() vazio só serve para pular a linha
		
		// Podemos concatenar texto com o operador +
		
		System.out.println("Estudando Java " + "desde hoje!");
		
		// Podemos imprimir números também, e o Java converte automaticamente
		
        System.out.println("Com parênteses, 2 + 2 = " + (2 + 2));
        
        // OBS: os parênteses em (2 + 2) são importantes! Sem eles,
        // "2 + 2" viraria concatenação de texto: "2" + 2 + 2 = "222"
        // pois o + é avaliado da esquerda para a direita.
        
        System.out.println("Sem parênteses, 2 + 2 = " + 2 + 2); // imprime "Sem parênteses: 22"

        // Fim do main(): quando a última linha do main() é executada,
        // o programa termina normalmente.
        
	}

}