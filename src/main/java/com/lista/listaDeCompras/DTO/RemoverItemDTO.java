package com.lista.listaDeCompras.DTO;

import com.lista.listaDeCompras.models.ProdutoEnum;

public class RemoverItemDTO {

    ProdutoEnum produto;

    public ProdutoEnum getProduto() {
        return produto;
    }

    public void setProduto(ProdutoEnum produto) {
        this.produto = produto;
    }
}
