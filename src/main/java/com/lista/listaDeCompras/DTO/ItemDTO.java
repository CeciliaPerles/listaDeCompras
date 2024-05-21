package com.lista.listaDeCompras.DTO;

import com.lista.listaDeCompras.models.Produto;

public class ItemDTO {

    Produto produto;

    Integer quandidadeDeItens;

    public Integer getQuandidadeDeItens() {
        return quandidadeDeItens;
    }

    public void setQuandidadeDeItens(Integer quandidadeDeItens) {
        this.quandidadeDeItens = quandidadeDeItens;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
