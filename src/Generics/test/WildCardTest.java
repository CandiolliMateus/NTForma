package src.Generics.test;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando o cachorro!");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando o gato!");
    }
}

public class WildCardTest {

    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato(), new Gato()};

        // consultarAnimais(cachorros);
        // consultarAnimais(gatos);

        List<Cachorro> listaDeCachorros = new ArrayList<>();
        listaDeCachorros.add(new Cachorro());
        listaDeCachorros.add(new Cachorro());
        listaDeCachorros.add(new Cachorro());

        List<Gato> listaDeGatos = new ArrayList<>();
        listaDeGatos.add(new Gato());
        listaDeGatos.add(new Gato());
        listaDeGatos.add(new Gato());

        consultarAnimaisList(listaDeCachorros);
        consultarAnimaisList(listaDeGatos);
    }

    public static void consultarAnimais(Animal[] animais) {

        for (Animal animal : animais) {

            animal.consulta();
        }
    }

    // O PONTO DE INTERROGAÇÃO É UM FORMA DE FAZER COM QUE O JAVA ACEITE QUE SEJAM ADICIONADOS OBJETOS NESTE ARRAY FILHOS DA CLASSE PRINCIPAL
    // CLASSE PRINCIPAL: Animal
    // CLASSES FILHAS: Cachorro e Gato
    public static void consultarAnimaisList(List<? extends Animal> animais) {

        for (Animal animal : animais) {

            animal.consulta();
        }
    }

    // O PONTO DE INTERROGAÇÃO É UM FORMA DE FAZER COM QUE O JAVA ACEITE QUE SEJAM ADICIONADOS OBJETOS NESTE ARRAY, QUE SEJAM DE SUPERCLASSES DE CACHORRO
    // SUB CLASSE: Cachorro
    // SUPER CLASSES: Animal e Object

    /**
    public static void consultarCachorrosList(List<? super Cachorro> cachorrosList) {

        for (Cachorro cachorro : cachorrosList) {

            cachorro.consulta();
        }

    }
     **/
}
