package com.lista.listaDeCompras.DTO;

import com.lista.listaDeCompras.models.Produto;

public class ItemDTO {

    Produto produto;

    Integer quantidadeDeItens;

    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(Integer quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
