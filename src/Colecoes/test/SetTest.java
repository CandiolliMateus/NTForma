package src.Colecoes.test;

import src.Colecoes.classes.Produto;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {

        Produto produto01 = new Produto("123", "Laptop Sony", 2000.0, 0);
        Produto produto02 = new Produto("456", "Picanha", 49.9, 7);
        Produto produto03 = new Produto("789", "Batedeira Britânia", 375.0, 4);
        Produto produto04 = new Produto("101", "Barra de Chcolate Nestlé", 7.5, 25);
        Produto produto05 = new Produto("112", "Papel Higiênico 16", 22.9, 40);
        Produto produto06 = new Produto("131", "1kg de Frango", 12.9, 0);
        Produto produto07 = new Produto("415", "300g Presunto", 7.0, 0);

        // O HASHSET NÃO PERMITE ELEMENTOS DUPLICADOS
        // ELE UTILIZA OS MÉTODOS equals E hashcode PARA DESCOBRIR SE EXISTE ALGUM ELEMENTE DUPLICADO
        Produto produto08 = new Produto("123", "Laptop Dell", 2000.0, 0);

        Set<Produto> produtoSet = new HashSet<>();
        // Set<Produto> produtoSet = new LinkedHashSet<>(); -> ESSA É A FORMA DE DEXIAR ORDENADO PELA INSERÇÃO DOS ELEMENTOS

        produtoSet.add(produto01);
        produtoSet.add(produto02);
        produtoSet.add(produto03);
        produtoSet.add(produto04);
        produtoSet.add(produto05);
        produtoSet.add(produto06);
        produtoSet.add(produto07);
        produtoSet.add(produto08);

        for (Produto produto : produtoSet) {

            System.out.println(produto);
        }
    }
}
