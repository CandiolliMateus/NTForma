package src.Colecoes.test;

import src.Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(3);
        numeros.add(4);
        numeros.add(1);
        numeros.add(9);

        Collections.sort(numeros);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println(Collections.binarySearch(numeros, 3));

        /**
        List<Produto> produtos = new ArrayList<>();
        Produto produto01 = new Produto("123", "Laptop Sony", 2000.0);
        Produto produto02 = new Produto("456", "Picanha", 49.9);
        Produto produto03 = new Produto("789", "Batedeira Britânia", 375.0);
        Produto produto04 = new Produto("101", "Barra de Chcolate Nestlé", 7.5);
        Produto produto05 = new Produto("112", "Papel Higiênico 16", 22.9);
        produtos.add(produto01);
        produtos.add(produto02);
        produtos.add(produto03);
        produtos.add(produto04);
        produtos.add(produto05);
        Collections.sort(produtos, new ProdutoNomeComparator());

        Produto produto06 = new Produto("000", "Antena", 35.0);

        System.out.println(Collections.binarySearch(produtos, produto06, new ProdutoNomeComparator()));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        Integer[] arrayInteger = new Integer[3];
        arrayInteger[0] = 2;
        arrayInteger[1] = 9;
        arrayInteger[2] = 4;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger, 1));
         **/
    }
}
