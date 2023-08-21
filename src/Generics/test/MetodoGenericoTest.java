package src.Generics.test;

import src.Colecoes.classes.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {

    public static void main(String[] args) {

        criarArray(new Cachorro());

        List<Gato> listaDeGatos = criarArrayComRetorno(new Gato());
        System.out.println(listaDeGatos);

        // criarArrayExtendendoOutraClasse(new Double()); -> ERRO DE COMPILAÇÃO
        criarArrayExtendendoOutraClasse(new Gato());
        criarArrayExtendendoOutraClasse(new Cachorro());
    }

    public static <T> void criarArray(T t) {

        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }

    public static  <T> List<T> criarArrayComRetorno(T t) {

        List<T> lista = new ArrayList<>();
        lista.add(t);
        return lista;
    }

    public static <T extends Animal> void criarArrayExtendendoOutraClasse(T t) {

        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }
}
