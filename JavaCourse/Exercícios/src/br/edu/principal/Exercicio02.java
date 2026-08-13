package br.edu.principal;

/*
 * ============================================================
 *  EXERCÍCIO 02 - VARIÁVEIS E TIPOS DE DADOS
 *  (referente à Aula02_VariaveisETipos.java)
 * ============================================================
 *
 * ENUNCIADO:
 * Crie um programa que armazene os dados de um produto de uma loja:
 *   1) nome do produto        (String)
 *   2) preço do produto       (double)
 *   3) quantidade em estoque  (int)
 *   4) produto está em promoção? (boolean)
 *   5) categoria do produto, usando apenas 1 letra (char) ex: 'E' de Eletrônico
 *
 * Depois:
 *   - Exiba todos os dados formatados no console.
 *   - Calcule e exiba o VALOR TOTAL em estoque (preço * quantidade).
 *   - Crie uma constante (final) chamada TAXA_IMPOSTO = 0.10 (10%) e
 *     calcule quanto seria o imposto sobre o preço do produto.
 */

public class Exercicio02 {

    public static void main(String[] args) {

        // TODO 1: declare as variáveis do produto
        String nomeProduto = "Fone de Ouvido Bluetooth";
        double preco = 149.90;
        int quantidadeEstoque = 35;
        boolean emPromocao = true;
        char categoria = 'E';

        // TODO 2: exiba os dados formatados
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + quantidadeEstoque + " unidades");
        System.out.println("Em promoção? " + emPromocao);
        System.out.println("Categoria: " + categoria);

        // TODO 3: calcule o valor total em estoque
        double valorTotalEstoque = preco * quantidadeEstoque;
        System.out.println("Valor total em estoque: R$ " + valorTotalEstoque);

        // TODO 4: crie a constante TAXA_IMPOSTO e calcule o imposto
        final double TAXA_IMPOSTO = 0.10;
        double imposto = preco * TAXA_IMPOSTO;
        System.out.println("Imposto sobre o preço: R$ " + imposto);
    }
}

/*
 * ------------------------------------------------------------
 * Depois de terminar, tente:
 * - Trocar os valores das variáveis e ver como a saída muda.
 * - Usar String.valueOf() para transformar o preço em texto.
 * ------------------------------------------------------------
 */