package src.Colecoes.test;

import src.Colecoes.classes.Produto;

import java.util.*;

public class SortProdutoTest {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        Produto[] produtosArray = new Produto[5];

        /**
        Produto produto01 = new Produto("123", "Laptop Sony", 2000.0);
        Produto produto02 = new Produto("456", "Picanha", 49.9);
        Produto produto03 = new Produto("789", "Batedeira Britânia", 375.0);
        Produto produto04 = new Produto("101", "Barra de Chcolate Nestlé", 7.5);
        Produto produto05 = new Produto("112", "Papel Higiênico 16", 22.9);

        produtosArray[0] = produto01;
        produtosArray[1] = produto02;
        produtosArray[2] = produto03;
        produtosArray[3] = produto04;

        produtos.add(produto01);
        produtos.add(produto02);
        produtos.add(produto03);
        produtos.add(produto04);
        produtos.add(produto05);
         **/

        /**
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("-------------------------");

        Collections.sort(produtos, new ProdutoNomeComparator());
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("-------------------------");
         **/

        System.out.println(Arrays.toString(produtosArray));
    }
}

