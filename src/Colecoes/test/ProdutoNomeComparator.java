package src.Colecoes.test;

import src.Colecoes.classes.Produto;

import java.util.Comparator;

class ProdutoNomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {

        return o1.getNome().compareTo(o2.getNome());
    }
}
