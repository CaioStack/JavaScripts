package br.edu.principal;

/*
 * ============================================================
 *  EXERCÍCIO 01 - INTRODUÇÃO AO JAVA
 *  (referente à Aula01.java)
 * ============================================================
 *
 * ENUNCIADO:
 * 1) Exiba seu nome completo no console usando System.out.println().
 * 2) Em seguida, na MESMA linha, exiba seu curso e a linguagem que
 *    está estudando, usando dois System.out.print().
 * 3) Utilize System.out.printf() para exibir uma frase contendo:
 *    - o ano atual (número inteiro)
 *    - o nome da linguagem (texto)
 *    dentro da mesma frase formatada.
 * 4) Adicione comentários explicando o que cada linha faz.
 *
 * DICA: revise a Aula01.java antes de começar.
 */

public class Exercicio01 {

    public static void main(String[] args) {

        // TODO 1: exiba seu nome completo aqui
        System.out.println("Caio Salgado Marques");

        // TODO 2: exiba curso + linguagem na mesma linha (use print duas vezes)
        System.out.print("Curso: ");
        System.out.print("Análise e Desenvolvimento de Sistemas");
        System.out.println(); // pula linha ao final

        // TODO 3: use printf para exibir ano + linguagem formatados
        System.out.printf("No ano de %d estou estudando %s.%n", 2026, "Java");
    }
}

/*
 * ------------------------------------------------------------
 * GABARITO / SOLUÇÃO SUGERIDA (só olhe depois de tentar sozinho!)
 * ------------------------------------------------------------
 *
 * public class Exercicio01_Introducao {
 *     public static void main(String[] args) {
 *         System.out.println("Maria da Silva");
 *
 *         System.out.print("Curso: Análise e Desenvolvimento de Sistemas | ");
 *         System.out.print("Linguagem: Java");
 *         System.out.println();
 *
 *         System.out.printf("No ano de %d estou estudando %s.%n", 2026, "Java");
 *     }
 * }
 */