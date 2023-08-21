package src.ClassesAbstratas.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor() {

    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    @Override
    public void imprime() {
        System.out.println("DENTRO DO IMPRIME NO VENDEDOR");
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
