package src.Interfaces.test;

import src.Interfaces.classes.Produto;

public class ProdutoTest {

    public static void main(String[] args) {

        Produto produto = new Produto("Laptop", 2.3, 2200);
        produto.calcularImposto();
        produto.calculaFrete();

        System.out.println(produto);
    }
}
