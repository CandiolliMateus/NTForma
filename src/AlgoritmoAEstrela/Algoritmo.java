package src.AlgoritmoAEstrela;

import java.util.Random;

public class Algoritmo {

    public static void main(String[] args) {

        int[][] matriz = criarMatrizAlgoritmoA(3, 3);

        int[] pontoInicial = retornaPontoInicial(matriz, 0, 0);
        int[] pontoFinal = retornaPontoFinal(matriz, 2, 2);

        imprimirMatrizAlgoritmoA(matriz);
        retornaPontos(pontoInicial, pontoFinal);

        // System.out.println("PONTO INICIAL ATUALIZADO: " + pontoInicial);
    }

    public static int[][] criarMatrizAlgoritmoA(int dimensaoLinhas, int dimensaoColunas) {

        if (dimensaoLinhas == 1) {
            dimensaoLinhas = dimensaoLinhas + 1;
        }

        if (dimensaoColunas == 1) {
            dimensaoColunas = dimensaoColunas + 1;
        }

        int[][] matriz = new int[dimensaoLinhas][dimensaoColunas];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(2);
            }
        }
        return matriz;
    }

    public static int[][] imprimirMatrizAlgoritmoA(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for(int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j]);
                }
            System.out.println();
            }
        return matriz;
    }

    public static int[] retornaPontoInicial(int[][] matriz, int linha, int coluna) {

        matriz[linha][coluna] = 0;
        return new int[]{linha, coluna};
    }

    public static int[] retornaPontoFinal(int[][] matriz, int linha, int coluna) {

        matriz[linha][coluna] = 0;
        return new int[]{linha, coluna};
    }

    public static void retornaPontos(int[] pontoDePartida, int[] pontoDeDestino) {

        {
            System.out.println("Ponto de saída: ");
            for (int coordenadasDePartida = 0; coordenadasDePartida < pontoDePartida.length; coordenadasDePartida++) {
                System.out.println(pontoDePartida[coordenadasDePartida]);
            }
            System.out.println();
        }

        {
            System.out.println("Ponto de destino: ");
            for (int coordenadasDestido = 0; coordenadasDestido < pontoDeDestino.length; coordenadasDestido++) {
                System.out.println(pontoDeDestino[coordenadasDestido]);
            }
            System.out.println();
        }
    }
}
