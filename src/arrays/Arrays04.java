package src.arrays;

public class Arrays04 {

    public static void main(String[] args) {

        // CRIAÇÃO DE ARRAYS MULTIDIMENCIONAIS
        // NESSE CASO O JAVA EXIGE A DEFINIÇÃO DO TAMANHO DOS DOIS ARRAYS
        int[][] calendario = new int[12][2];
        calendario[0][0] = 1;
        calendario[0][1] = 31;
        calendario[1][0] = 2;
        calendario[1][1] = 28;
        calendario[2][0] = 3;
        calendario[2][1] = 31;
        calendario[3][0] = 4;
        calendario[3][1] = 30;
        calendario[4][0] = 5;
        calendario[4][1] = 31;
        calendario[5][0] = 6;
        calendario[5][1] = 30;
        calendario[6][0] = 7;
        calendario[6][1] = 31;
        calendario[7][0] = 8;
        calendario[7][1] = 31;
        calendario[8][0] = 9;
        calendario[8][1] = 30;
        calendario[9][0] = 10;
        calendario[9][1] = 31;
        calendario[10][0] = 11;
        calendario[10][1] = 30;
        calendario[11][0] = 12;
        calendario[11][1] = 31;

        /**
        for (int i = 0; i < calendario.length; i++) {

            for (int j = 0; j < calendario[i].length; j++) {
                System.out.print(calendario[i][j]);
            }
            System.out.println();
        }
         **/

        int[][] dias = new int[3][];
        dias[0] = new int[]{35, 36};
        dias[1] = new int[]{43, 42, 41, 40, 39};
        dias[2] = new int[]{1, 2, 3};

        // NESSE PRIMEIRO FOREACH USA-SE UMA "VARIÁVEL" ARRAY PARA RECEBER O ARRAY, POIS PRECISA SER IGUAL AO ELEMENTO QUE SERÁ RECEBIDO
        /**
        for (int[] ref : dias) {

            for (int dia : ref) {
                System.out.println(dia);
            }
        }
         **/

        // CRIAÇÃO DE ARRAY MULTIDIMENCIONAL
        // 5 DIMENÇÕES
        // VALOR POSIÇÃO [2][0] = 10
        int[][] multidimencional = {{1, 2}, {5, 6, 7}, {10, 11}, {14, 15, 16, 17}, {20}};
        System.out.println(multidimencional[2][0]);

        for (int[] ref : multidimencional) {

            for (int numeros : ref) {
                System.out.println(numeros);
            }
        }
    }
}
