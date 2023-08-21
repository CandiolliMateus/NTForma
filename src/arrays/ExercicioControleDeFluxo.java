package src.arrays;

public class ExercicioControleDeFluxo {

    public static void main(String[] args) {

        // IMPRIMA TODOS OS NÚMEROS PARES DE 0 ATÉ 100.000

        for (int i = 0; i < 100000; i++) {

            int resultado = i % 2;

            if(resultado == 0) {
                System.out.println(i);
            }
        }
    }
}
