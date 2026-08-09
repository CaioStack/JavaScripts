import java.util.ArrayList;

public class Aula01 {
    public static void main(String[] args) {

    int idade = 16;
    String nome = "Caio";

    var nomeVariavel = "Caio";

    // Numeros inteiros = 127, 1, 23 ...

    // byte -> 8 bits -> -128 a 127
    // short -> 16 bits -> -32.768 a 32.767
    // int -> 32 bits -> -2.147.483.648 a 2.147.483.647
    // long -> 64 bits -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807


    // Numeros decimais = 1.2, 3.14, 5.6 ...

    // float -> 32 bits -> aproximadamente 7 dígitos de precisão, precisão simples
    // double -> 64 bits -> aproximadamente 15 dígitos de precisão, precisão dupla


    // String -> sequência de caracteres, exemplo: "Caio", "Olá, mundo!", "Java"

    // Char -> 16 bits -> representa um único caractere, exemplo: 'A', 'B', 'C'

    // Boolean -> 1 bit -> representa verdadeiro ou falso, exemplo: true, false

    
    byte b = 100;
    short s = 1000;
    int i = 10000;
    long l = 100000L;
    float f = 10.5f;
    double d = 20.5;
    char c = 'A';
    String str = "Caio";
    boolean bool = true;

    int[] numeros = {1, 2, 3, 4, 5};
    boolean[] booleanos = {true, false, true};

    if (str.isBlank()) {
        System.out.println("Vazio");
    } else if (str.equals("Caio")) {
        System.out.println("O nome é Caio.");
    } 
    else {
        System.out.println("O nome não é Caio.");
    }

    System.out.println(numeros[0]);
    System.out.println(numeros.length); // quantidade de elementos no array

    System.out.println(booleanos[0]);
    System.out.println(booleanos.length);


    // ArrayList -> lista dinâmica

    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("Caio");
    nomes.add("João");
    nomes.add("Maria");
    nomes.add("Pedro");

    System.out.println(nomes.get(0));
    System.out.println(nomes.size());

    nomes.remove(0);
    System.out.println(nomes.get(0));
    System.out.println(nomes.size());


    // loops

    for (int j = 0; j < nomes.size(); j++) {
        System.out.println(nomes.get(j));

        }
    }
}