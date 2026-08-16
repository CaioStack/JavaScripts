/*
 * ============================================================
 *  AULA 02 - VARIÁVEIS, TIPOS PRIMITIVOS E OPERADORES
 * ============================================================
 * CONTEÚDOS:
 *  1) O que é uma variável e como declarar
 *  2) Tipos primitivos (byte, short, int, long, float, double, char, boolean)
 *  3) Conversão de tipos (casting implícito e explícito)
 *  4) Operadores aritméticos, relacionais, lógicos e de atribuição
 *  5) Constantes (final)
 *  6) Strings (introdução - classe, não primitivo)
 * ============================================================
 */
public class aula02 {

    public static void main(String[] args) {

        // ===================== VARIÁVEIS =====================
        // Uma variável é um "espaço na memória" com um NOME, um TIPO e um VALOR.
        // Sintaxe:  tipo nome = valor;

        // --------- TIPOS PRIMITIVOS NUMÉRICOS INTEIROS ---------
        byte idadeByte = 25;        // 8 bits  -> vai de -128 a 127
        short anoCurto = 2026;      // 16 bits -> vai de -32.768 a 32.767
        int idade = 20;             // 32 bits -> o mais usado para inteiros
        long populacaoMundial = 8_000_000_000L; // 64 bits -> use "L" no final
        // O "_" dentro do número é só um separador visual (Java ignora), ajuda a ler.

        // --------- TIPOS PRIMITIVOS DE PONTO FLUTUANTE (decimais) ---------
        float altura = 1.75f;       // 32 bits -> precisa do sufixo "f"
        double peso = 68.5;         // 64 bits -> tipo decimal PADRÃO em Java (mais preciso)

        // --------- TEXTO E CARACTERE ---------
        char letraInicial = 'J';    // UM único caractere, entre ASPAS SIMPLES
        String nome = "João";       // TEXTO (String NÃO é primitivo, é uma classe!)
        // Strings usam aspas DUPLAS. Isso é uma pegadinha comum: char usa ' ', String usa " ".

        // --------- BOOLEANO ---------
        boolean estaEstudando = true; // só pode ser "true" ou "false"

        // Imprimindo tudo para ver os valores:
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Inicial: " + letraInicial);
        System.out.println("Está estudando? " + estaEstudando);

        // ===================== CONSTANTES =====================
        // A palavra "final" impede que o valor seja alterado depois.
        // Por convenção, constantes são escritas em MAIÚSCULO.
        final double PI = 3.14159;
        System.out.println("PI é constante: " + PI);
        // PI = 3.0; // <- isso daria ERRO DE COMPILAÇÃO, pois PI é final

        // ===================== CASTING (conversão de tipos) =====================
        // Conversão IMPLÍCITA (automática): de um tipo "menor" para um "maior",
        // o Java converte sozinho, pois não há risco de perda de dado.
        int numeroInt = 10;
        double numeroDouble = numeroInt; // int -> double: automático
        System.out.println("Convertido automaticamente: " + numeroDouble);

        // Conversão EXPLÍCITA (forçada): de um tipo "maior" para um "menor",
        // você PRECISA fazer o cast manualmente, pois pode haver perda de dados.
        double valorComDecimais = 9.99;
        int valorSemDecimais = (int) valorComDecimais; // trunca (corta) a parte decimal
        System.out.println("Cast explícito (perde decimais): " + valorSemDecimais); // 9

        // ===================== OPERADORES ARITMÉTICOS =====================
        int a = 10, b = 3; // é possível declarar várias variáveis na mesma linha
        System.out.println("a + b = " + (a + b)); // soma -> 13
        System.out.println("a - b = " + (a - b)); // subtração -> 7
        System.out.println("a * b = " + (a * b)); // multiplicação -> 30
        System.out.println("a / b = " + (a / b)); // divisão INTEIRA -> 3 (descarta o resto!)
        System.out.println("a % b = " + (a % b)); // MÓDULO (resto da divisão) -> 1

        // Para divisão com casas decimais, pelo menos um dos números precisa ser double:
        System.out.println("a / (double) b = " + (a / (double) b)); // -> 3.333...

        // ===================== OPERADORES DE ATRIBUIÇÃO =====================
        int contador = 5;
        contador += 2; // equivale a: contador = contador + 2;  -> 7
        contador -= 1; // contador = contador - 1;              -> 6
        contador *= 3; // contador = contador * 3;               -> 18
        contador /= 2; // contador = contador / 2;               -> 9
        System.out.println("Contador final: " + contador);

        // Incremento e decremento
        int x = 5;
        x++; // pós-incremento: x = x + 1 -> 6
        System.out.println("x após ++: " + x);
        x--; // pós-decremento: x = x - 1 -> 5
        System.out.println("x após --: " + x);

        // ===================== OPERADORES RELACIONAIS =====================
        // Retornam sempre um boolean (true ou false)
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a < b: " + (a < b));   // false
        System.out.println("a == b: " + (a == b)); // false (== compara valores)
        System.out.println("a != b: " + (a != b)); // true

        // ===================== OPERADORES LÓGICOS =====================
        boolean chove = true;
        boolean fimDeSemana = false;
        System.out.println("chove && fimDeSemana: " + (chove && fimDeSemana)); // AND -> false
        System.out.println("chove || fimDeSemana: " + (chove || fimDeSemana)); // OR  -> true
        System.out.println("!chove: " + (!chove)); // NOT -> false (inverte o valor)
    }
}
