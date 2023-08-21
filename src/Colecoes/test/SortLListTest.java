package src.Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLListTest {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<Double> numeros = new ArrayList<>();

        nomes.add("Mateus Candiolli");
        nomes.add("Carolina Candiolli");
        nomes.add("Osmar Candiolli");
        nomes.add("Maria Candiolli");
        nomes.add(0, "Dory");

        numeros.add(2.3);
        numeros.add(1.8);
        numeros.add(3.9);
        numeros.add(7.1);
        numeros.add(4.0);

        // ESSA ORDENAÇÃO PADRÃO É FEITA EM ORDEM CRESCENTE, ALFABÉTICA OU NUMÉRICA
        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("------------------");

        for (Double numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("------------------");

        Collections.sort(numeros);
        for (Double numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("------------------");
    }
}
