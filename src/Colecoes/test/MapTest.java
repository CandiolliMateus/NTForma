package src.Colecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        // NESSA PRIMEIRA INSTANCIAÇÃO A ORDEM NÃO É MANTIDA
        // Map<String, String> mapa = new HashMap<>();

        // PARA A ORDEM DE INSERÇÃO SER MANTIDA INSTANCIA-SE DESSA FORMA
        Map<String, String> mapa = new LinkedHashMap<>();

        mapa.put("teklado", "teclado");
        mapa.put("mauze", "mouse");
        mapa.put("vc", "você");
        mapa.put("meza", "mesa");

        /**
        for (String chave : mapa.keySet()) {

            System.out.println(chave);
        }

        for (String valor : mapa.values()) {

            System.out.println(valor);
        }
         **/

        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
