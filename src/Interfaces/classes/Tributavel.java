package src.Interfaces.classes;

public interface Tributavel {

    // INTERFACES PODEM TER ATRIBUTOS
    // PORÉM OS ATRIBUTOS SÃO CONSIDERADOS CONSTANTES
    public static final double IMPOSTO = 0.2;

    // INTERFACES NÃO TEM MÉTODOS CONCRETOS, APENAS ABSTRATOS
    void calcularImposto();
}
