// Exercício 01 - Referente apenas a conteúdos da Aula01 + Scanner

/* Exercício: Sistema de Controle de Presença e Matrícula

Uma escola de idiomas precisa de um programa que controle a matrícula de uma turma com no máximo 5 vagas.

1. O programa deve pedir ao usuário o nome do curso, o valor da mensalidade e se o curso está ativo.
2. Em seguida, deve coletar os dados de 5 candidatos: nome, idade e se já pagaram a matrícula.
3. Um candidato só pode ser matriculado se tiver 16 anos ou mais e já ter pago a matrícula,
os que não atenderem aos critérios devem gerar uma mensagem informando o motivo (idade insuficiente, pagamento pendente, ou ambos).
4. Ao final da coleta, o programa deve informar quantas vagas foram preenchidas e quantas ainda restam.
5. O primeiro aluno matriculado teve a matrícula cancelada por motivo administrativo e deve ser removido.
6. Depois da remoção, o programa deve listar os matriculados restantes, numerados, e informar quantos sobraram.
7. Por fim, deve exibir um resumo com: nome do curso, valor da mensalidade, se está ativo, a primeira letra do nome do curso
e a quantidade final de matriculados. */

package br.edu.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------------------------------------------
        // 1. Dados do curso
        // ---------------------------------------------------
        System.out.println("Digite o nome do curso: ");
        String curso = sc.next();

        System.out.println("Digite o valor da mensalidade: ");
        double valorMensalidade = sc.nextDouble(); // nextDouble() já lê como número decimal,
                                                     // não precisa ler como String e converter depois

        System.out.println("O curso está ativo? (true/false): ");
        boolean cursoAtivo = sc.nextBoolean(); // nextBoolean() só aceita "true" ou "false"

        // ---------------------------------------------------
        // 2. Preparando "recipientes" para os 5 candidatos
        // ---------------------------------------------------

        String[] nomes = new String[5];       // vai guardar os 5 nomes
        int[] idades = new int[5];            // vai guardar as 5 idades
        boolean[] pagou = new boolean[5];     // vai guardar se cada um pagou (true/false)

        // ArrayList<String> é uma "lista dinâmica": diferente do array,
        // ela cresce/diminui conforme usa .add() e .remove().
        
        ArrayList<String> matriculados = new ArrayList<>();

        // ---------------------------------------------------
        // 3. Coletando os dados dos 5 candidatos + já verificando a matrícula
        // ---------------------------------------------------
        // O for roda de i = 0 até i = 4 (5 voltas no total).
        // Em cada volta, pedir os dados de UM candidato e guardar.
        // na posição "i" de cada array (nomes[i], idades[i], pagou[i]).

        for (int i = 0; i < 5; i++) {

            // (i + 1) é só para mostrar "1°, 2°, 3°..." ao usuário,
            // já que o array conta a partir do 0, mas isso é só estética.
        	
            System.out.println("Digite o nome do " + (i + 1) + "° candidato: ");
            nomes[i] = sc.next();

            System.out.println("Digite a idade do " + (i + 1) + "° candidato: ");
            idades[i] = sc.nextInt();

            System.out.println("O " + (i + 1) + "° candidato já pagou a matrícula? (true/false): ");
            pagou[i] = sc.nextBoolean();

            // Agora, ainda dentro do for (por isso não precisa repetir
            // esse bloco de if 5 vezes), verifica se esse candidato
            // específico pode ser matriculado.

            boolean idadeOk = idades[i] >= 16;
            boolean pagamentoOk = pagou[i];

            if (idadeOk && pagamentoOk) {
                // Atende aos dois critérios -> entra na lista de matriculados
                matriculados.add(nomes[i]);
                System.out.println(nomes[i] + " foi matriculado(a) com sucesso!");
            } else if (!idadeOk && !pagamentoOk) {
                // Não atende a nenhum dos dois
                System.out.println(nomes[i] + " não pode se matricular: idade insuficiente e pagamento pendente.");
            } else if (!idadeOk) {
                // Só o critério de idade falhou
                System.out.println(nomes[i] + " não pode se matricular: idade insuficiente.");
            } else {
                // Só o critério de pagamento falhou
                System.out.println(nomes[i] + " não pode se matricular: pagamento pendente.");
            }

            System.out.println("-------------------------------------------");
        }

        // ---------------------------------------------------
        // 4. Vagas preenchidas e vagas restantes
        // ---------------------------------------------------
        // matriculados.size() diz quantos elementos existem
        // dentro do ArrayList nesse momento.

        int totalVagas = 5;
        int vagasPreenchidas = matriculados.size();
        int vagasRestantes = totalVagas - vagasPreenchidas;

        System.out.println("Vagas preenchidas: " + vagasPreenchidas);
        System.out.println("Vagas restantes: " + vagasRestantes);
        System.out.println("-------------------------------------------");

        // ---------------------------------------------------
        // 5. Removendo o primeiro aluno matriculado
        // ---------------------------------------------------
        // Só faz sentido remover se existir pelo menos 1 matriculado,
        // por isso o if antes de mexer na lista.

        if (!matriculados.isEmpty()) {
            String removido = matriculados.get(0); // pega o nome antes de remover, só para avisar
            matriculados.remove(0);                // remove o elemento da posição 0 (o primeiro)
            System.out.println(removido + " teve a matrícula cancelada por motivo administrativo.");
        } else {
            System.out.println("Não há matriculados para cancelar.");
        }

        System.out.println("-------------------------------------------");

        // ---------------------------------------------------
        // 6. Listando os matriculados restantes, numerados
        // ---------------------------------------------------
        // Percorremos o ArrayList (agora sem o primeiro aluno) com um for.
        // matriculados.size() já reflete o tamanho atual, depois da remoção.

        System.out.println("Lista final de matriculados:");
        for (int i = 0; i < matriculados.size(); i++) {
            System.out.println((i + 1) + " - " + matriculados.get(i));
        }
        System.out.println("Total de matriculados restantes: " + matriculados.size());
        System.out.println("-------------------------------------------");

        // ---------------------------------------------------
        // 7. Resumo final
        // ---------------------------------------------------
        // charAt(0) pega o caractere que está na posição 0 de uma String,
        // ou seja, a primeira letra do nome do curso.

        char inicialCurso = curso.charAt(0);

        System.out.println("Resumo do curso:");
        System.out.println("Nome do curso: " + curso);
        System.out.println("Valor da mensalidade: " + valorMensalidade);
        System.out.println("Curso ativo: " + cursoAtivo);
        System.out.println("Inicial do curso: " + inicialCurso);
        System.out.println("Quantidade final de matriculados: " + matriculados.size());
    }
}