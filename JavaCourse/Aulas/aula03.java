/*
 * ============================================================
 *  AULA 03 - ESTRUTURAS CONDICIONAIS (if, else, switch)
 * ============================================================
 * CONTEÚDOS:
 *  1) if / else if / else
 *  2) Operador ternário
 *  3) switch (tradicional e a versão moderna com "arrow")
 *  4) Boas práticas de indentação e chaves
 * ============================================================
 */
public class aula03 {

    public static void main(String[] args) {

        int idade = 17;

        // ===================== IF / ELSE =====================
        // A estrutura "if" executa um bloco de código SOMENTE SE a condição
        // dentro dos parênteses for verdadeira (true).
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            // O bloco "else" executa quando a condição do "if" é falsa.
            System.out.println("Você é menor de idade.");
        }

        // ===================== IF / ELSE IF / ELSE =====================
        // Usado quando temos VÁRIAS condições possíveis, avaliadas em ordem.
        // Assim que uma condição é verdadeira, o resto é ignorado.
        int nota = 75;
        String conceito;

        if (nota >= 90) {
            conceito = "A";
        } else if (nota >= 70) {   // só é checado se a condição de cima for falsa
            conceito = "B";
        } else if (nota >= 50) {
            conceito = "C";
        } else {
            conceito = "D"; // caso nenhuma condição acima seja satisfeita
        }
        System.out.println("Conceito: " + conceito); // -> B

        // ===================== CONDIÇÕES COMPOSTAS =====================
        int idadeCandidato = 22;
        boolean temCNH = true;

        if (idadeCandidato >= 18 && temCNH) { // AND: as DUAS precisam ser verdadeiras
            System.out.println("Pode dirigir.");
        }

        // ===================== OPERADOR TERNÁRIO =====================
        // Forma resumida de um if/else simples que RETORNA um valor.
        // Sintaxe: condição ? valorSeVerdadeiro : valorSeFalso;
        int numero = 8;
        String paridade = (numero % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número é " + paridade);
        // Equivale a:
        // if (numero % 2 == 0) { paridade = "par"; } else { paridade = "ímpar"; }

        // ===================== SWITCH (tradicional) =====================
        // Útil quando comparamos UMA variável com VÁRIOS valores possíveis.
        int diaDaSemana = 3;
        String nomeDia;

        switch (diaDaSemana) {
            case 1:
                nomeDia = "Domingo";
                break; // "break" impede que o código "caia" para o próximo case
            case 2:
                nomeDia = "Segunda";
                break;
            case 3:
                nomeDia = "Terça";
                break;
            case 4:
                nomeDia = "Quarta";
                break;
            default:
                // "default" executa quando nenhum case bate com o valor
                nomeDia = "Dia inválido";
        }
        System.out.println("Dia: " + nomeDia); // -> Terça

        // ATENÇÃO: se esquecer o "break", o Java continua executando os
        // cases seguintes (isso se chama "fall-through") até achar um break
        // ou o switch terminar. É um erro comum de iniciantes!

        // ===================== SWITCH MODERNO (arrow, Java 14+) =====================
        // Versão mais enxuta, sem necessidade de "break", e pode retornar valor direto.
        String nomeDiaModerno = switch (diaDaSemana) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            default -> "Dia inválido";
        };
        System.out.println("Dia (moderno): " + nomeDiaModerno);
    }
}
