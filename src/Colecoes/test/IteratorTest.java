package src.Colecoes.test;

import src.Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        Produto produto01 = new Produto("123", "Laptop Sony", 2000.0, 0);
        Produto produto02 = new Produto("456", "Picanha", 49.9, 7);
        Produto produto03 = new Produto("789", "Batedeira Britânia", 375.0, 4);
        Produto produto04 = new Produto("101", "Barra de Chcolate Nestlé", 7.5, 25);
        Produto produto05 = new Produto("112", "Papel Higiênico 16", 22.9, 40);
        Produto produto06 = new Produto("131", "1kg de Frango", 12.9, 0);
        produtos.add(produto01);
        produtos.add(produto02);
        produtos.add(produto03);
        produtos.add(produto04);
        produtos.add(produto05);
        produtos.add(produto06);

        System.out.println(produtos.size());
        System.out.println("-------------------------------------------");

        Iterator<Produto> produtoIterator = produtos.iterator();
        while (produtoIterator.hasNext()) {

            if (produtoIterator.next().getQuantidade() == 0) {
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
}
