package src.IO.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FilesTest {

    public static void main(String[] args) {

        // NESSE FORMATO O ARQUVIVO É CRIADO NA RAIZ DO PROJETO
        File file = new File("NTLabsTeste99.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("Criou um novo arquivo? " + newFile);
            System.out.println("Qual o nome do arquivo? " + file.getName());
            System.out.println("Permissão de leitura? " + file.canRead());
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("É um diretório? " + file.isDirectory());
            System.out.println("É um arquivo oculto? " + file.isHidden());
            System.out.println("Ultima modificação em milesegundos: " + file.lastModified());
            System.out.println("Ultima modificação com date: " + new Date(file.lastModified()));
            // System.out.println(file.exists());

            /**
            if (file.exists()) {
                System.out.println("Deletado? " + file.delete());
            }
             **/

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------------");

        // NESSE FORMATO O ARQUIVO É CRIADO NO ENDEREÇO INDICADO
        File file02 = new File("C:\\Mateus\\Filmes\\NTLabsEmFilmesTeste077.txt");
        try {
            boolean newFile = file02.createNewFile();
            System.out.println("Criou um arquivo novo? " + newFile);
            System.out.println("Qual o nome do arquivo? " + file02.getName());
            System.out.println("Path: " + file02.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
