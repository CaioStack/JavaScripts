package br.edu.principal;

/*
 * ============================================================
 *  AULA 01 - INTRODUÇÃO AO JAVA
 * ============================================================
 *
 * Bem-vindo(a) ao curso de Java! Nesta primeira aula você vai
 * aprender:
 *   1) O que é Java e como um programa Java é organizado
 *   2) O que é a classe "main" (ponto de entrada do programa)
 *   3) Como exibir mensagens no console
 *   4) Como escrever comentários
 *
 * -----------------------------------------------------------
 * SOBRE A LINGUAGEM
 * -----------------------------------------------------------
 * Java é uma linguagem orientada a objetos, compilada para um
 * "bytecode" que roda dentro da JVM (Java Virtual Machine).
 * Isso permite que o mesmo programa rode em qualquer sistema
 * operacional que tenha a JVM instalada ("write once, run
 * anywhere").
 *
 * Todo código Java fica dentro de uma CLASSE. O nome do arquivo
 * .java PRECISA ser igual ao nome da classe pública que ele
 * contém. Ex.: a classe "Aula01_Introducao" precisa estar no
 * arquivo "Aula01_Introducao.java".
 *
 * -----------------------------------------------------------
 * TIPOS DE COMENTÁRIOS EM JAVA
 * -----------------------------------------------------------
 * // Comentário de uma linha
 *
 * /* Comentário
 *    de várias linhas *\/
 *
 * /** Comentário de documentação (Javadoc) *\/
 */

public class Aula01 {

    // O método "main" é o PONTO DE ENTRADA de qualquer aplicação Java.
    // A JVM procura exatamente por esta assinatura para iniciar o programa:
    //   public static void main(String[] args)
    //
    // - public  -> pode ser acessado de fora da classe (a JVM precisa acessá-lo)
    // - static  -> pertence à classe, não precisa criar um objeto para chamá-lo
    // - void    -> não retorna nenhum valor
    // - String[] args -> vetor de argumentos passados via linha de comando
    public static void main(String[] args) {

        // System.out.println() imprime um texto no console e PULA uma linha
        System.out.println("Olá, mundo!");

        // System.out.print() imprime SEM pular linha
        System.out.print("Este texto ");
        System.out.print("fica na mesma linha.");
        System.out.println(); // pula linha manualmente

        // Também é possível formatar saídas com printf
        System.out.printf("Estou aprendendo %s em %d de %s.%n", "Java", 2026, "agosto");
        
     // O método printf substitui os marcadores de posição pelos argumentos na ordem:
     // %s -> Substituído por "Java" (texto/String)
     // %d -> Substituído por 2026 (número decimal/inteiro)
     // %s -> Substituído por "agosto" (texto/String)
     // %n -> Quebra de linha

        // Toda instrução (statement) em Java termina com ponto e vírgula ";"
        System.out.println("Fim da Aula 01!");
    }
}

/*
 * -----------------------------------------------------------
 * RESUMO DA AULA
 * -----------------------------------------------------------
 * - Todo programa Java começa em "public static void main(String[] args)"
 * - System.out.println() imprime com quebra de linha
 * - System.out.print() imprime sem quebra de linha
 * - System.out.printf() imprime com formatação (%s, %d, %f, %n...)
 * - Comentários ajudam a documentar o código: // e /* *\/
 *
 * Agora vá para o Exercício 01 e pratique o que aprendeu!
 * ============================================================
 */