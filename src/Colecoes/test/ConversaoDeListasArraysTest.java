package src.Colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListasArraysTest {

    public static void main(String[] args) {

        List<Integer> somenteNumeros = new ArrayList<>();
        somenteNumeros.add(16);
        somenteNumeros.add(25);
        somenteNumeros.add(31);

        Integer [] inteiros = new Integer[somenteNumeros.size()];
        somenteNumeros.toArray(inteiros); // -> NESTE CASO ELE RETORNARÁ UMA LISTA DE OBJETOS (Objects[] objetos)

        System.out.println(somenteNumeros);
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(inteiros));
        System.out.println("--------------------------");

        Integer[] arrayInteger = new Integer[4];
        arrayInteger[0] = 2;
        arrayInteger[1] = 9;
        arrayInteger[2] = 4;
        arrayInteger[3] = 6;

        List<Integer> numeros02 = Arrays.asList(arrayInteger);

        List<Integer> numeros03 = new ArrayList<>();
        numeros03.addAll(Arrays.asList(arrayInteger));

        numeros02.set(1, 17);

        numeros03.add(25);
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(numeros02);
        System.out.println(numeros03);
    }
}
