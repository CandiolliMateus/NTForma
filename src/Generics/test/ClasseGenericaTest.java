package src.Generics.test;

import src.Generics.classes.Carro;
import src.Generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {

    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("Palio"));
        carrosDisponiveis.add(new Carro("BMW"));
        carrosDisponiveis.add(new Carro("Mercedes"));

        Alugavel<Carro> carroAlugavel = new Alugavel<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getDisponivelParaAluguel();
        System.out.println("Alugando por um mês.");
        carroAlugavel.devolvendo(carro);

        System.out.println("-----------------------------------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Sony Vaio"));
        computadoresDisponiveis.add(new Computador("MacBook"));
        computadoresDisponiveis.add(new Computador("Dell"));
        computadoresDisponiveis.add(new Computador("AlienWare"));

        Alugavel<Computador> computadorAlugavel = new Alugavel<>(computadoresDisponiveis);
        Computador computador = computadorAlugavel.getDisponivelParaAluguel();
        System.out.println("Alugando computador.");
        computadorAlugavel.devolvendo(computador);
        computador = computadorAlugavel.getDisponivelParaAluguel();
        System.out.println("Alugando computador.");
        computadorAlugavel.devolvendo(computador);
    }
}

// T = typ -> NÃO NECESSARIAMENTE É PRECISO USAR O T, PODE-SE USAR QUALQUER LETRA (<T> OU <G> OU <QUALQUER LETRA>)
// PODE-SE INFORMAR MAIS DE UM ATRIBUTO DENTRO DO GENERICS
class Alugavel<G> {

    private List<G> disponivelParaAluguel;
    public Alugavel(List<G> disponivelParaAluguel) {
        this.disponivelParaAluguel = disponivelParaAluguel;
    }

    public G getDisponivelParaAluguel () {

        G g = disponivelParaAluguel.remove(0);
        System.out.println("Alugando: " + g);
        System.out.println("Disponível para alugar: " + disponivelParaAluguel);
        return g;
    }

    public void devolvendo (G g) {

        System.out.println("Devolvendo mercadoria: " + g);
        disponivelParaAluguel.add(g);
        System.out.println("Disponível para alugar: " + disponivelParaAluguel);
    }
}
