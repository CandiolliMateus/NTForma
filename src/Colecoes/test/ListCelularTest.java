package src.Colecoes.test;

import src.Colecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {

    public static void main(String[] args) {

        Celular celular01 = new Celular("Galaxy S7", "123456");
        Celular celular02 = new Celular("iPhone 6s", "981821");
        Celular celular03 = new Celular("Sony Xperia", "919212");

        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular01);
        celularList.add(celular02);
        celularList.add(celular03);

        for (Celular celular : celularList) {
            System.out.println(celular);
        }
    }
}
