package src.IO.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {

    public static void main(String[] args) {

        File diretorio = new File("pasta teste criacao de diretorios");
        System.out.println(diretorio.mkdir());

        File diretorio02 = new File("C:\\Mateus\\Filmes\\pasta nos filmes");
        diretorio02 = new File("C:\\Mateus\\Filmes\\nova pasta do curso");
        System.out.println(diretorio02.mkdir());

        // File arquivo = new File("C:\\Mateus\\Filmes\\nova pasta do curso\\criando um arquivo no diretorio.txt");
        File arquivo = new File(diretorio, "criando um arquivo no diretorio.txt");
        // arquivo = new File(diretorio02, "criando um arquivo no diretorio.txt");
        try {
            System.out.println(arquivo.createNewFile());
            System.out.println(arquivo.createNewFile());
            System.out.println(arquivo.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // RENOMEANDO ARQUIVOS
        File renomeandoArquivo = new File("novo nome do arquivo.txt");
        // -> QUANDO FOI EXECUTADO, COMO NÃO FOI PASSADO O DIRETORIO ELE SAI DA PASTA EM QUE ESTAVA E VAI PARA A RAIZ DO PROJETO
        arquivo.renameTo(renomeandoArquivo);

        // RENOMEANDO DIRETORIOS
        // File renomeandoDiretorio = new File("novo diretorio");
        // -> QUANDO FOI EXECUTADO, COMO NÃO FOI PASSADO O DIRETORIO ELE SAI DA PASTA EM QUE ESTAVA E VAI PARA A RAIZ DO PROJETO
        // diretorio02.renameTo(renomeandoDiretorio);

        buscarArquivos();
    }

    public static void buscarArquivos() {

        File file = new File("novo diretorio");
        String[] lista = file.list();

        for (String arquivos : lista) {
            System.out.println(arquivos);
        }
    }
}
