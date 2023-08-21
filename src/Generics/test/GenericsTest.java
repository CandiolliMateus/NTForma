package src.Generics.test;

import src.Colecoes.classes.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {

        // TYPE ERASURE
        List<String> lista = new ArrayList<>();
        lista.add("Nome");
        lista.add("31");
        lista.add("new Consumidor(Mateus, 1234567891)");

        for (String obj : lista) {

            System.out.println(obj);
        }
    }
}
