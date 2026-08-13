package br.edu.principal;

/*
 * ============================================================
 *  AULA 02 - VARIÁVEIS E TIPOS DE DADOS
 * ============================================================
 *
 * Java é uma linguagem FORTEMENTE TIPADA: toda variável precisa
 * ter um tipo declarado, e esse tipo não muda depois.
 *
 * TIPOS PRIMITIVOS (não são objetos, ocupam espaço fixo na memória):
 *   byte    -> inteiro pequeno    (8 bits,  -128 a 127)
 *   short   -> inteiro médio      (16 bits)
 *   int     -> inteiro padrão     (32 bits)  <- o mais usado
 *   long    -> inteiro grande     (64 bits)  <- termina com "L"
 *   float   -> decimal (menor precisão)      <- termina com "f"
 *   double  -> decimal (maior precisão)      <- o mais usado
 *   char    -> um único caractere             <- aspas simples 'a'
 *   boolean -> true ou false
 *
 * TIPOS REFERÊNCIA (objetos), como String, não são primitivos,
 * mas são usados o tempo todo no dia a dia.
 */

public class Aula02 {

    public static void main(String[] args) {

        // Declarando e inicializando variáveis primitivas
        int idade = 20;                 // número inteiro
        long populacaoMundial = 8_100_000_000L; // "L" indica que é long
        double altura = 1.75;           // número decimal (double)
        float peso = 68.5f;             // número decimal (float) - note o "f"
        char inicialNome = 'J';         // um único caractere entre aspas simples
        boolean estudante = true;       // verdadeiro ou falso

        // String NÃO é primitivo, é uma classe (objeto), mas é usada como se fosse
        String nome = "João";

        // Exibindo os valores
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("População mundial aprox.: " + populacaoMundial);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Inicial do nome: " + inicialNome);
        System.out.println("É estudante? " + estudante);

        // CONSTANTES: usamos "final" quando o valor NUNCA deve mudar
        final double PI = 3.14159;
        System.out.println("PI: " + PI);
        // PI = 3.14; // <- isso geraria erro de compilação, pois PI é final

        // CONVERSÃO DE TIPOS (casting)
        // De um tipo "menor" para um "maior" -> conversão implícita (automática)
        int numeroInteiro = 10;
        double numeroDecimal = numeroInteiro; // int -> double, automático
        System.out.println("Convertido automaticamente: " + numeroDecimal);

        // De um tipo "maior" para um "menor" -> conversão explícita (cast manual)
        // Pode haver perda de dados (ex.: perde a parte decimal)
        double valor = 9.99;
        int valorConvertido = (int) valor; // cast manual, perde o ".99"
        System.out.println("Convertido manualmente (perde decimais): " + valorConvertido);

        // Convertendo texto para número e número para texto
        String textoNumero = "42";
        int numeroConvertido = Integer.parseInt(textoNumero); // String -> int
        String numeroParaTexto = String.valueOf(100);         // int -> String
        System.out.println("Texto convertido para número: " + numeroConvertido);
        System.out.println("Número convertido para texto: " + numeroParaTexto);

        // "var" (Java 10+) infere o tipo automaticamente pelo valor atribuído
        var cidade = "Fortaleza"; // o compilador entende que é String
        System.out.println("Cidade (usando var): " + cidade);
    }
}

/*
 * -----------------------------------------------------------
 * RESUMO DA AULA
 * -----------------------------------------------------------
 * - Tipos primitivos: byte, short, int, long, float, double, char, boolean
 * - String é uma classe, não um primitivo
 * - "final" cria constantes (valor não pode ser alterado)
 * - Conversões: implícita (automática) e explícita (cast manual)
 * - Integer.parseInt() converte String -> int
 * - String.valueOf() converte número -> String
 * - "var" permite inferência de tipo
 * ============================================================
 */