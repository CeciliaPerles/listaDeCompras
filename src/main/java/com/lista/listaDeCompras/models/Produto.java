package com.lista.listaDeCompras.models;

import lombok.Getter;

public class Produto {

    private int codigo;
    private String nome;
    private String descricao;
    private double preco;

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
