package src.Colecoes.test;

import src.Colecoes.classes.Consumidor;
import src.Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {

    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Mateus", "123456789");
        Consumidor consumidor2 =  new Consumidor("DevDojo", "101112131");

        Produto produto01 = new Produto("123", "Laptop Sony", 2000.0);
        Produto produto02 = new Produto("456", "Picanha", 49.9);
        Produto produto03 = new Produto("789", "Batedeira Britânia", 375.0);
        Produto produto04 = new Produto("101", "Barra de Chcolate Nestlé", 7.5);
        Produto produto05 = new Produto("112", "Papel Higiênico 16", 22.9);

        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtosConsumidor01 = new ArrayList<>();
        produtosConsumidor01.add(produto02);
        produtosConsumidor01.add(produto04);
        produtosConsumidor01.add(produto03);

        List<Produto> produtosConsumidor02 = new ArrayList<>();
        produtosConsumidor02.add(produto01);
        produtosConsumidor02.add(produto05);

        map.put(consumidor, produtosConsumidor01);
        map.put(consumidor2, produtosConsumidor02);

        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
            
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()) {

                System.out.println(produto.getNome());
            }
        }
    }
}
