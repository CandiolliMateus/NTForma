package src.Strings.test;

import java.util.Scanner;

public class StringBuilderTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String escrever = "";

        System.out.println("ESCREVA UMA FRASE: ");
        escrever = scanner.next();
        System.out.println(escrever);

        // ENTRE PARENTESES FICA A CAPACIDADE DE CARACTERES PARA ESSA STRING

        /**
        StringBuilder stringBuilder = new StringBuilder(10);
        stringBuilder.append("Uma frase qualquer.");

        String string = stringBuilder.toString();
        String string = stringBuilder; -> DESSA FORMA CAUSARIA UM ERRO

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.delete(3, 6));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.insert(2, "###"));
        System.out.println(string);
         **/

        scanner.close();
    }
}
