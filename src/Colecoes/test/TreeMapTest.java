package src.Colecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("C", "Letra C");
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("---------------------");

        System.out.println(map.headMap("D", true));
        System.out.println("---------------------");

        System.out.println(map.pollFirstEntry());
        System.out.println("---------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("---------------------");

        System.out.println(map.pollLastEntry());
        System.out.println("---------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("---------------------");

        System.out.println(map.descendingMap());
        System.out.println("---------------------");
    }
}
