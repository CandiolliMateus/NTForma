package src.Polimorfismo.test;

import src.Polimorfismo.classes.Gerente;
import src.Polimorfismo.classes.RelatorioPagamento;
import src.Polimorfismo.classes.Vendedor;

public class PolimorfismoTest {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Mateus", 5000, 2000);
        Vendedor vendedor = new Vendedor("Silas", 2500, 20000);

        RelatorioPagamento relatorios = new RelatorioPagamento();

        // relatorios.relatorioPagamentoGerente(gerente);
        // System.out.println("------------------");
        // relatorios.relatorioPagamentoVendedor(vendedor);

        relatorios.relatorioPagamentos(gerente);
        System.out.println("------------------");
        relatorios.relatorioPagamentos(vendedor);
    }
}
