package com.lista.listaDeCompras.DTO;

import com.lista.listaDeCompras.models.Produto;

public class RemoverItemDTO {

    Produto produto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
