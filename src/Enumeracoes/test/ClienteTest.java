package src.Enumeracoes.test;

import src.Enumeracoes.classes.Cliente;
import src.Enumeracoes.classes.TipoCliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Mateus", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(cliente);
        System.out.println("--------------");
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_PUBLICA.getId());
    }
}
