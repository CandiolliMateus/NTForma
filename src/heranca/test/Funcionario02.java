package src.heranca.test;

import src.heranca.classes.Pessoa;

public class Funcionario02 extends Pessoa {
    public Funcionario02(String nome) {
        super(nome);
    }

    // É POSSÍVEL ACESSAR OS ATRIBUTOS DIRETAMENTE MESMO NÃO ESTANDO NO MESMO PACOTE POIS ESSA CLASSE HERDA DE PESSOA

    /**
    public void imprime() {
        super.nome;
    }
     **/
}
