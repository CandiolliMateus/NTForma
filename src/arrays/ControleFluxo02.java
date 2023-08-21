package src.arrays;

public class ControleFluxo02 {

    public static void main(String[] args) {

        // DADO O VALOR DE UM CARRO, DESCUBRA EM QUANTAS VEZES ELE PODE SER PARCELADO
        // O VALOR DAS PARCELAS NÃO PODE SER INFERIO À R$ 1.000,00

        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
                continue;
            }
            System.out.printf("Nº de parcelas: %d. Valor parcelas: R$ %.2f." + "\n", parcela, valorParcela);
        }
    }
}
