package src.heranca.test;

import src.heranca.classes.Endereco;
import src.heranca.classes.Funcionario;
import src.heranca.classes.Pessoa;

public class HerancaTest {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Mateus", "03081876010");
        Endereco endereco = new Endereco();
        Funcionario funcionario = new Funcionario("Carolina", "123456789");

        // pessoa.setNome("Mateus");
        // pessoa.setCpf("03081876010");

        endereco.setRua("Alfredo Marotski");
        endereco.setBairro("Canudos");

        pessoa.setEndereco(endereco);

        // funcionario.setNome("Carolina");
        // funcionario.setCpf("123456789");
        funcionario.setSalario(20000);
        funcionario.setEndereco(endereco);

        pessoa.imprime();
        funcionario.imprime();
    }
}
