package src.Polimorfismo.classes;

public class RelatorioPagamento {

    /**
    public void relatorioPagamentoGerente(Gerente gerente) {
        System.out.println("Gerando relatório de pagamento para a gerência: ");
        gerente.calcularPagamento();
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
    }

    public void relatorioPagamentoVendedor(Vendedor vendedor) {
        System.out.println("Gerando relatório de pagamento para os vendedores: ");
        vendedor.calcularPagamento();
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário: " + vendedor.getSalario());
    }
     **/

    public void relatorioPagamentos(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento: ");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());

        if (funcionario instanceof Gerente) {

            Gerente gerente = (Gerente) funcionario;
            System.out.println("Participação nos lucros: " + gerente.getPnl());
        }

        if (funcionario instanceof Vendedor) {

            // Vendedor vendedor = (Vendedor) funcionario;

            // FAZENDO O CASTING DIRETO, FUNCIONA IGUAL A FORMA TRADICIONAL
            System.out.println("Total de vendas: " + ((Vendedor) funcionario).getTotalVendas());
        }
    }
}
