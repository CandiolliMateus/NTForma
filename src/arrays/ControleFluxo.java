package src.arrays;

public class ControleFluxo {

    public static void main(String[] args) {

        // DADO O VALOR DE UM CARRO, DESCUBRA EM QUANTAS VEZES ELE PODE SER PARCELADO
        // O VALOR DAS PARCELAS NÃO PODE SER INFERIO À R$ 1.000,00

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {

            double valorParcela = valorTotal / parcela;

            /**
            if (valorParcela >= 1000) {

                System.out.printf("Parcelas: %d. Valor parcelas: R$ %.2f" + "\n",  + parcela, valorParcela);
                // System.out.println();
            } else {
                System.out.println("Saindo do laço");
                break;
            }
             **/

            if (valorParcela < 1000) {

                System.out.println("Saindo do laço");
                break;
            }

            System.out.printf("Parcelas: %d. Valor parcelas: R$ %.2f" + "\n",  + parcela, valorParcela);
        }
    }
}
