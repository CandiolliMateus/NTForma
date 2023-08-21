package src.ClassesAbstratas.test;

import src.ClassesAbstratas.classes.Funcionario;
import src.ClassesAbstratas.classes.Gerente;
import src.ClassesAbstratas.classes.Vendedor;

public class FuncionarioTest {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Mateus", "20237-2", 2500, 50000);
        Gerente gerente = new Gerente("Crolina", "20237-2", 4500);

        vendedor.calculaSalario();
        gerente.calculaSalario();

        System.out.println(vendedor);
        vendedor.imprime();
        System.out.println("-----------------");
        System.out.println(gerente);
        gerente.imprime();
    }
}
