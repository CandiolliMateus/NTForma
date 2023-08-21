package src.Colecoes.test;

import src.Colecoes.classes.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("D");
        queue.add("A");
        queue.add("B");
        queue.add("F");
        queue.add("E");

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println("---------------------------");
        // System.out.println(queue.offer());
        System.out.println(queue.peek()); // RETORNA O PRIMEIRO ELEMENTO DA Queue
        System.out.println(queue.poll()); // RETORNA E REMOVE O PRIMEIRO ELEMENTO DA Queue
        System.out.println("---------------------------");
        System.out.println(queue);
        System.out.println(queue.size());
    }
}
