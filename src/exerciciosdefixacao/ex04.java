package exerciciosdefixacao;

import entidades.Produtos;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produtos produtos = new Produtos();

        System.out.println("Insira os dados de algun produto: ");

        System.out.println("Nome: ");
        produtos.nome = sc.nextLine();

        System.out.println("Preço: ");
        produtos.preco = sc.nextDouble();

        System.out.println("Quantidades em estoque: ");
        produtos.quantidade = sc.nextInt();

        System.out.println("Dados do Produto: " + produtos);

        System.out.println();
        System.out.println("Insira uma quantidade para que o estoque do produto seja atualizado: ");
        int quantidade = sc.nextInt();
        produtos.addProdutos(quantidade);

        System.out.println("Dados atualizados: " + produtos);

        System.out.println();

        System.out.println("Insira a quantidades que deseja remover do produto: ");
        quantidade = sc.nextInt();
        produtos.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produtos);

    }

}
