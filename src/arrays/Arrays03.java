package src.arrays;

public class Arrays03 {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        int[] numeros02 = {1, 2, 3, 4, 5, 6};
        int[] numeros03 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /**
        for (int i = 0; i < numeros03.length; i++) {
            System.out.println(numeros03[i]);
        }
         **/

        /**
        for (int numero : numeros02) {
            System.out.println(numero);
        }
         **/

        String[] nomes = {"Mateus", "Carolina", "Alexandre"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
