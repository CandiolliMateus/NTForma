package src.Exceptions.checkedexceptions.test;

import src.Exceptions.checkedexceptions.classes.Funcionario;
import src.Exceptions.checkedexceptions.classes.Pessoa;

public class SobrescritaComExceptionsTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();

        funcionario.salvar();
    }
}
