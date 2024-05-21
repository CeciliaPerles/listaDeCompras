package com.lista.listaDeCompras.models;

public class Item {

    Produto produto;

    int quandidadeDeItens;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuandidadeDeItens() {
        return quandidadeDeItens;
    }

    public void setQuandidadeDeItens(int quandidadeDeItens) {
        this.quandidadeDeItens = quandidadeDeItens;
    }
}
