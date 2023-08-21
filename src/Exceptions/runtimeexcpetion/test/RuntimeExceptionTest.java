package src.Exceptions.runtimeexcpetion.test;

import java.io.ObjectStreamException;

public class RuntimeExceptionTest {

    public static void main(String[] args) {

        /**
        int a = 10;
        int b = 0;

        if (b != 0) {
            int c = a / b;
            System.out.println(c);
        }
         **/

        /**
        Object obejto = null;
        System.out.println(obejto.toString());
         **/

        /**
        try {
            int[] a = new int[2];
            System.out.println(a[2]);
            System.out.println("IMPRIMINDO DEPOIS A EXCEÇÃO");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("FORA DO BLOCO try catch");
         **/

        divisao(10, 2);
    }

    private static void divisao(int numero01, int numero02) {

        if (numero02 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de zero para o segundo número.");
        }
        int resultado = numero01 / numero02;
        System.out.println(resultado);
    }
}
