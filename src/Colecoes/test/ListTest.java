package src.Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        // ASSIM FUNCIONAVA ATÉ A VERSÃO 4 DO JAVA
        /**
        List nomes = new ArrayList();
        nomes.add("Mateus");
        nomes.add("Alexandre");
        nomes.add(25);

        for (Object nome : nomes) {
            System.out.println(nome);
        }
         **/

        // A PARTIR DO JAVA 5
        // FORAM ADICIONADOS OS GENÉRICS, QUE DEFINE O TIPO DE DADOS DA LISTA
        /**
        List<String> maisNomes = new ArrayList<String>();
         **/

        // A PARTIR DO JAVA 7
        List<String> outrosNomes  = new ArrayList<>();
        outrosNomes.add("Mateus");
        outrosNomes.add("Alexandre");
        // outrosNomes.add(32); -> COMO DEFINIMOS O TIPO DE DADOS, AGORA NÃO É PERMITIDO A INSERÇÃO DE DADOS DIFERENTES DO TIPO DA ARRAYLIST
        for (String nomes : outrosNomes) {
            System.out.println(nomes);
        }
        System.out.println("Tamanho: " + outrosNomes.size());
        System.out.println("----------------------------------------");

        outrosNomes.add("Carolina");
        for (String nomes : outrosNomes) {
            System.out.println(nomes);
        }
        System.out.println("Tamanho: " + outrosNomes.size());
        System.out.println("----------------------------------------");

        outrosNomes.add("Osmar");
        outrosNomes.add("Maria Teni");
        outrosNomes.add("Josias");
        outrosNomes.add("Silas");
        for (int i = 0; i < outrosNomes.size(); i++) {
            System.out.println(outrosNomes.get(i));
        }
        System.out.println("Tamanho: " + outrosNomes.size());
        System.out.println("----------------------------------------");

        // REMOVE POR MEIO DO OBJETO = PASSAMOS A STRING E O JAVA IDENTIFICA O OBJETO
        outrosNomes.remove("Mateus");
        for (String nome : outrosNomes) {
            System.out.println(nome);
        }
        System.out.println("Tamanho: " + outrosNomes.size());
        System.out.println("----------------------------------------");

        // REMOVE POR MEIO DO INDICE NO ARRAY
        outrosNomes.remove(2);
        for (String nome : outrosNomes) {
            System.out.println(nome);
        }
        System.out.println("Tamanho: " + outrosNomes.size());
        System.out.println("----------------------------------------");

        // APAGA OS DADOS
        outrosNomes.clear();
        System.out.println("Tamanho: " + outrosNomes.size());
        System.out.println("----------------------------------------");

        List<String> maisNomes = new ArrayList<>();
        maisNomes.add("Odir");
        maisNomes.add("Carla");
        maisNomes.add("Julia");

        // ADICIONANDO UMA ARRAYLIST À UMA OUTRA ARRAYLISTA JÁ EXISTENTE
        outrosNomes.addAll(maisNomes);
        for (String nomes : outrosNomes) {
            System.out.println(nomes);
        }
        System.out.println("Tamanho: " + outrosNomes.size());
        System.out.println("----------------------------------------");

        // NÃO SE CRIA COLEÇÕES COM TIPOS PRIMITIVOS
        // NESSE CASO DEVE-SE USAR A VERSÃO OBJETO DESSES TIPOS
        List<Integer> somenteNumeros = new ArrayList<>();
        somenteNumeros.add(16);
        somenteNumeros.add(25);
        somenteNumeros.add(31);

        for (Integer numeros : somenteNumeros) {
            System.out.println(numeros);
        }
    }
}
