package src.IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterReaderTest {

    public static void main(String[] args) {

        File file = new File("Teste.txt");

        // TRY WITH RESSOURCES
        try (FileWriter fileWriter = new FileWriter(file, true);
             FileReader fileReader = new FileReader(file)) {

            fileWriter.write("Treinando na NT\n e pulando uma linha 05");
            fileWriter.flush();
            char[] leitura = new char[500];
            int size = fileReader.read(leitura);
            System.out.println(size);
            for (char c : leitura) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // PODEMOS PASSAR UM NOME DE ARQUIVO OU UM OBJETO File
        // FileWriter fileWriter = new FileWriter("Teste.txt");
        /**
        try {

            // NOS PARÂMETROS DO CONTRUTOR É INFORMADO O ARQUIVO E O append, QUE POR PADRÃO ESTÁ COMO FALSE
            // SE FOR COLOCADO COMO TRUE NÃO HAVERÁ SOBRECRIÇÃO DE DADOS, APENAS SERÃO ACRESCNTADOS NOVOS DADOS
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("Treinando na NT\n e pulando uma linha 05");

            // ESSE MÉTODO É  PARA GARANTIR QUE A INFORMAÇÃO A SER ESCRITA SAIU DO SISTEMA PARA O ARQUIVO
            fileWriter.flush();
            // SEMPRE SE DEVE FECHAR O ARQUIVO
            fileWriter.close();

            FileReader fileReader = new FileReader(file);

            char[] leitura = new char[500];
            int size = fileReader.read(leitura);
            System.out.println(size);
            for (char c : leitura) {
                System.out.println(c);
            }
            // SEMPRE FECHAR APÓS ESCREVER OU LER
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         **/
    }
}
