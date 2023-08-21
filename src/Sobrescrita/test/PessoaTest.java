package src.Sobrescrita.test;

import src.Sobrescrita.classes.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Joaquina");
        pessoa.setIdade(300);

        System.out.println(pessoa);
    }
}
