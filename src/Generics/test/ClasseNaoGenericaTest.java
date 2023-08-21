package src.Generics.test;

import src.Generics.classes.Carro;
import src.Generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTest {

    public static void main(String[] args) {

        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mês.");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println("-----------------------------------------");

        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computadorAlugado = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o computador por um mês.");
        computadorAlugavel.devolverComputador(computadorAlugado);
    }
}

class CarroAlugavel {

    private List<Carro> carrosDisponiveis = new ArrayList<>();
    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("Palio"));
        carrosDisponiveis.add(new Carro("BMW"));
        carrosDisponiveis.add(new Carro("Mercedes"));
    }

    public Carro getCarroDisponivel () {

        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponíveis: " + carrosDisponiveis);
        return carro;
    }

    public void devolverCarro (Carro carro) {

        System.out.println("Devolvendo carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis: " + carrosDisponiveis);
    }
}

class ComputadorAlugavel {

    private List<Computador> computadoresDisponiveis = new ArrayList<>();
    {
        computadoresDisponiveis.add(new Computador("Sony Vaio"));
        computadoresDisponiveis.add(new Computador("MacBook"));
        computadoresDisponiveis.add(new Computador("Dell"));
        computadoresDisponiveis.add(new Computador("AlienWare"));
    }

    public Computador getComputadorDisponivel () {

        Computador computador = computadoresDisponiveis.remove(0);
        System.out.println("Alugando carro: " + computador);
        System.out.println("Carros disponíveis: " + computadoresDisponiveis);
        return computador;
    }

    public void devolverComputador (Computador computador) {

        System.out.println("Devolvendo carro: " + computador);
        computadoresDisponiveis.add(computador);
        System.out.println("Carros disponíveis: " + computadoresDisponiveis);
    }
}
