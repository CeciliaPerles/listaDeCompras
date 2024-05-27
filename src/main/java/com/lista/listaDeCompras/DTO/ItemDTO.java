package com.lista.listaDeCompras.DTO;

import com.lista.listaDeCompras.models.ProdutoEnum;

public class ItemDTO {
//data transfer object - utilizamos para passar dados
// não expor todos os campos das classes
// quando não precisamos usar todos os campos
//segregar responsabilidades/funções
    ProdutoEnum produto;

    Integer quantidadeDeItens;

    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(Integer quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public ProdutoEnum getProduto() {
        return produto;
    }

    public void setProduto(ProdutoEnum produto) {
        this.produto = produto;
    }
}
