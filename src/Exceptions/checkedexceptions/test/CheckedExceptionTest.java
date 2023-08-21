package src.Exceptions.checkedexceptions.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        /**
        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
         **/

        abrirArquivo();
    }

    public static void criarArquivo() {

        File file = new File("Teste.txt");

        try {
            System.out.println("Arquivo criado? " + file.createNewFile());
        } catch (IOException e) {

            e.printStackTrace(); // -> MÉTODO QUE PEGA E RETORNAR O QUE ACONTECEU DE ERRO
        }
    }

    public static void abrirArquivo() {

        try {
            // System.out.println("Arquivo criado? " + file.createNewFile());
            System.out.println("Abrindo um arquivo.");
            System.out.println("Lendo um arquivo.");
            throw new Exception();
            // System.out.println("Escrevendo no arquivo.");
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace(); // -> MÉTODO QUE PEGA E RETORNAR O QUE ACONTECEU DE ERRO
        } finally {
            System.out.println("Fechar o arquivo.");
        }
    }
}
