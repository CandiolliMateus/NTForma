package src.ClassesAbstratas.classes;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        salario = salario + (salario * 0.2);
    }

    @Override
    public void imprime() {
        System.out.println("DENTRO DO IMPRIME NO GERENTE");
    }
}
