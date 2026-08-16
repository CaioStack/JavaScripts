/*
 * ============================================================
 *  AULA 04 - ESTRUTURAS DE REPETIÇÃO (LOOPS)
 * ============================================================
 * CONTEÚDOS:
 *  1) for
 *  2) while
 *  3) do-while
 *  4) break e continue
 *  5) Loops aninhados (loop dentro de loop)
 * ============================================================
 */
public class aula04 {

    public static void main(String[] args) {

        // ===================== FOR =====================
        // Ideal quando SABEMOS quantas vezes queremos repetir.
        // Sintaxe: for (inicialização; condição; incremento) { ... }
        System.out.println("=== Contando de 1 a 5 ===");
        for (int i = 1; i <= 5; i++) {
            // i = 1  -> inicialização (roda 1 vez, no início)
            // i <= 5 -> condição (checada ANTES de cada repetição)
            // i++    -> incremento (roda DEPOIS de cada repetição)
            System.out.println("i = " + i);
        }
        // Depois do loop, a variável "i" deixa de existir (escopo do for)

        // ===================== WHILE =====================
        // Ideal quando NÃO sabemos exatamente quantas vezes vai repetir,
        // mas sabemos a CONDIÇÃO de parada.
        System.out.println("=== While: contagem regressiva ===");
        int contador = 5;
        while (contador > 0) {
            // A condição é checada ANTES de cada execução do bloco.
            System.out.println(contador);
            contador--; // IMPORTANTE: sem isso, o loop nunca terminaria (loop infinito)
        }
        System.out.println("Fogo!");

        // ===================== DO-WHILE =====================
        // Parecido com o while, MAS o bloco executa PELO MENOS UMA VEZ,
        // pois a condição só é checada DEPOIS da primeira execução.
        System.out.println("=== Do-while ===");
        int numero = 10;
        do {
            System.out.println("Executou pelo menos uma vez. Número: " + numero);
            numero++;
        } while (numero < 5); // condição falsa, mas já executou 1x antes de checar

        // ===================== BREAK =====================
        // "break" interrompe o loop IMEDIATAMENTE, saindo dele por completo.
        System.out.println("=== Break ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // ao chegar em 5, sai do loop
            }
            System.out.println("break loop: " + i);
        }

        // ===================== CONTINUE =====================
        // "continue" pula APENAS a iteração atual e vai para a próxima,
        // sem sair do loop.
        System.out.println("=== Continue (pulando números pares) ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // se for par, pula o println abaixo e vai pro próximo i
            }
            System.out.println("Número ímpar: " + i);
        }

        // ===================== LOOPS ANINHADOS =====================
        // Um loop dentro de outro. Muito usado para trabalhar com matrizes,
        // tabuadas, padrões visuais, etc.
        System.out.println("=== Tabuada de 1 a 3 ===");
        for (int tabuada = 1; tabuada <= 3; tabuada++) {
            for (int multiplicador = 1; multiplicador <= 5; multiplicador++) {
                System.out.println(tabuada + " x " + multiplicador + " = " + (tabuada * multiplicador));
            }
            System.out.println("---");
        }
    }
}
