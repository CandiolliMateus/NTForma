package src.arrays;

public class Arrays01 {

    public static void main(String[] args) {

        Double[] duracoes = new Double[5];

        // OU

        // CRIAÇÃO DE UM ARRAY
        // ESTABELE O TIPO DE DADO (PODE SER PRIMITIVO OU OBJETO)
        // NOMEIA-SE
        // DECLARA O ARRAY ("new" TIPO DE DADOS)
        // ESTABELECE O TAMANHO NOS COLCHETES [N]
        // UM ARRAY NÃO É EXPANSÍVEL
        int idades[] = new int[3];

        // CASO NÃO SEJA ATRIBUIDO NENHUM VALOR ÀS POSIÇÕES, O ARRAY INICIALIZA COM VALORES PADRÔES
        // byte, short, int, long, float, double = 0
        // char = ' '
        // boolean = false
        // reference (arrays de objetos) = null
        idades[0] = 31;
        idades[1] = 29;
        idades[2] = 27;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        System.out.println(duracoes[0]);
        System.out.println(duracoes[1]);

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Musashi";
        nomes[3] = "Pikolo";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
