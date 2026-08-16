/*
 * ============================================================
 *  AULA 01 - INTRODUÇÃO AO JAVA E PRIMEIRO PROGRAMA
 * ============================================================
 * CONTEÚDOS DESTA AULA:
 *  1) O que é Java e como ele funciona (JDK, JRE, JVM)
 *  2) Estrutura básica de um programa Java
 *  3) O método main() - ponto de entrada do programa
 *  4) System.out.println() e System.out.print()
 *  5) Comentários no código (//, /* */ /, /** */)
 *  6) Como compilar e rodar no Eclipse
 *
 * TEORIA RÁPIDA:
 * - JDK (Java Development Kit): pacote completo para DESENVOLVER em Java.
 *   Contém o compilador (javac), a JVM e bibliotecas.
 * - JRE (Java Runtime Environment): necessário apenas para RODAR programas Java.
 * - JVM (Java Virtual Machine): a "máquina virtual" que executa o bytecode
 *   (.class) gerado pelo compilador. É por isso que Java é multiplataforma:
 *   "escreva uma vez, rode em qualquer lugar" (Write Once, Run Anywhere).
 *
 * FLUXO: código-fonte (.java) --[javac compila]--> bytecode (.class)
 *        --[JVM interpreta/executa]--> programa rodando
 *
 * NO ECLIPSE:
 * - Cada arquivo .java normalmente tem uma classe pública com o MESMO NOME
 *   do arquivo. Ex: arquivo Aula01.java precisa ter "public class Aula01".
 * - Para rodar: clique com o botão direito no arquivo > Run As > Java Application.
 * - OBS: Como aqui os arquivos estão nomeados em minúsculo (aula01.java) para
 *   organização didática, ao colar no Eclipse renomeie a classe pública para
 *   bater com o nome do arquivo, ou renomeie o arquivo para Aula01.java.
 * ============================================================
 */

// Toda classe pública "NomeClasse" deve ficar em um arquivo "NomeClasse.java"
public class aula01 {

    // O método main() é o PONTO DE ENTRADA de qualquer aplicação Java.
    // A JVM procura exatamente esta assinatura para começar a executar o programa:
    // public   -> pode ser chamado de fora da classe (a JVM precisa acessá-lo)
    // static   -> pertence à classe, não a um objeto (não precisamos criar
    //             um objeto "aula01" para rodar o programa)
    // void     -> não retorna nenhum valor
    // main     -> nome fixo, reconhecido pela JVM
    // (String[] args) -> vetor de argumentos que podem ser passados via linha
    //                     de comando ao executar o programa
    public static void main(String[] args) {

        // Comentário de UMA linha: tudo depois de // é ignorado pelo compilador
        // Isso serve para você (ou outra pessoa) entender o código depois.

        /* Comentário de VÁRIAS linhas:
           tudo entre /* e */ /* é ignorado.
           Útil para explicações mais longas. */

        /**
         * Comentário de DOCUMENTAÇÃO (Javadoc): usado para gerar documentação
         * automática do projeto. Muito usado em métodos e classes.
         */

        // System.out é um objeto que representa a "saída padrão" (o console).
        // println() imprime o texto e PULA para a próxima linha depois.
        System.out.println("Olá, mundo! Este é meu primeiro programa em Java.");

        // print() imprime o texto e NÃO pula linha (o próximo print continua
        // na mesma linha).
        System.out.print("Este texto ");
        System.out.print("fica na mesma linha.");
        System.out.println(); // println() vazio só serve para pular a linha

        // Podemos concatenar (juntar) texto com o operador +
        System.out.println("Estudando Java " + "desde hoje!");

        // Podemos imprimir números também, e o Java converte automaticamente
        System.out.println("2 + 2 = " + (2 + 2));
        // OBS: os parênteses em (2 + 2) são importantes! Sem eles,
        // "2 + 2" viraria concatenação de texto: "2" + 2 + 2 = "222"
        // pois o + é avaliado da esquerda para a direita.
        System.out.println("Sem parênteses: " + 2 + 2); // imprime "Sem parênteses: 22"

        // Fim do main(): quando a última linha do main() é executada,
        // o programa termina normalmente.
    }
}
