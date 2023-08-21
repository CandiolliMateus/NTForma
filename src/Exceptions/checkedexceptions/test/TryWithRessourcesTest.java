package src.Exceptions.checkedexceptions.test;

import src.Exceptions.checkedexceptions.classes.Leitor01;
import src.Exceptions.checkedexceptions.classes.Leitor02;

import java.io.*;

public class TryWithRessourcesTest {

    public static void main(String[] args) {
        lerArquivo();
        // O FECHAMENTO SERÁ SEMPRE DE BAIXO PARA CIMA
    }

    public static void lerArquivo() {

        try (Leitor01 leitor01 = new Leitor01(); Leitor02 leitor02 = new Leitor02()) {

        } catch (Exception e) {
            e.printStackTrace();
        }

        // FORMA MAIS MODERNA DE IMPLEMENTAR O CLOSE
        // É NECESSÁRIO QUE A CLASSE IMPLEMENTE OU O MÉTODO "AutoCloseable" OU "Cloaseable"
        // PODE-SE INSTANCIAR MAIS DE UMA VARIÁVEL DENTRO DOS PARENTESES DO "try"
        // DESSA FORMA NÃO É MAIS NECESSÁRIO USAR O CATCH
        /**
        try (Reader reader = new BufferedReader(new FileReader("Teste.txt"))) {
        } catch (IOException e) {
            e.printStackTrace();
        }
         **/
    }

    public static void lerArquivoOld() {

        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("Teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
