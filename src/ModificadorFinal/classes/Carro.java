package src.ModificadorFinal.classes;

// É POSSÍVEL USAR O "final" DIRETAMENTE NA CLASSE
// QUANDO ISSO É FEITO IMPLICA QUE ESSA CLASSE NÃO PODERÁ SER EXTENDIDA
// RARAMENTE É UTILIZADO
// UM EXEMPLO É CLASSE "String"
public final class Carro {

    private String nome;
    private String marca;
    private final Comprador COMPRADOR = new Comprador();

    // FORMA DE SE NOMEAR "CONSTANTES" EM JAVA
    // COMO ESSA CONTANTE TEM O MODIFICADOR "static" O JAVA EXIGE QUE ELA SEJA INICIALIZADA ANTES DA CRIAÇÃO DOS OBJETOS
    private static final double VELOCIDADE_FINAL = 250;

    @Override
    public String toString() {
        return "Nome do  carro: " + nome + ", marca: " + marca + '.';
    }

    // NESTE CASO O MÉTOD NÃO PODE SER SUBSCRITO
    // QUANDO A CLASSE JÁ TIVER O "final" NÃO FAZ SENTIDO USAR NOS MÉTODOS
    // MAS A SOBRECARGAR É POSSÍVEL
    public final void imprimir() {
        System.out.println("Imprimindo um carro.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
