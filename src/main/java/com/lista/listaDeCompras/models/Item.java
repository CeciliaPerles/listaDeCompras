package com.lista.listaDeCompras.models;

import java.util.Objects;

public class Item {

    private ProdutoEnum produto;

    private int quandidadeDeItens;

    public ProdutoEnum getProduto() {
        return produto;
    }

    public void setProduto(ProdutoEnum produto) {
        this.produto = produto;
    }

    public int getQuandidadeDeItens() {
        return quandidadeDeItens;
    }

    public void setQuandidadeDeItens(int quandidadeDeItens) {
        this.quandidadeDeItens = quandidadeDeItens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return produto == item.produto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto);
    }
}
