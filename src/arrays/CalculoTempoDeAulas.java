package src.arrays;

public class CalculoTempoDeAulas {

    public static void main(String[] args) {

        String teste = "38.25";
        // StringBuilder teste02 = teste.toString();
        // System.out.println(teste.length());

        if (teste.length() == 5) {

            String minutos = "";
            String segundos = "";
            double minutosEmSegundos = 0;

            for (int i = 0; i < 2; i++) {
                char letra = teste.charAt(i);
                minutos = minutos + letra;
            }

            for (int i = 3; i < teste.length(); i++) {
                char letra = teste.charAt(i);
                segundos = segundos + letra;
            }

            minutosEmSegundos = (Double.parseDouble(minutos) * 60) + Double.parseDouble(segundos) + minutosEmSegundos;
            System.out.println("TOTAL DE SEGUNDOS: " + minutosEmSegundos);
        }
    }
}

