package src.IO.test;

import java.io.*;

public class BufferedTest {

    public static void main(String[] args) {

        File file = new File("Teste.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            bufferedWriter.newLine();
            bufferedWriter.write("Quero trabalhar com Java 03");
            bufferedWriter.newLine();
            bufferedWriter.write("Try With Ressources");
            bufferedWriter.flush();

            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
        try {

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // bufferedWriter.write("Treinando na NT e pulando uma linha 05");
            bufferedWriter.newLine();
            bufferedWriter.write("Quero trabalhar com Java");
            bufferedWriter.newLine();
            // bufferedWriter.write("Quero ganhar muito dinheiro");

            bufferedWriter.flush();
            bufferedWriter.close();

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String string = null;

            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         **/
    }
}
