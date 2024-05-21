package com.lista.listaDeCompras.services;
import com.lista.listaDeCompras.DTO.ItemDTO;
import com.lista.listaDeCompras.models.Item;
import com.lista.listaDeCompras.models.Produto;

import java.util.*;

public class ListaService {

    List<Item> listaDeItens = new ArrayList<Item>();

    public void adicionarItemNaLista(ItemDTO itemDTO){

        Item itemSalvar = new Item();

        itemSalvar.setQuandidadeDeItens(itemDTO.getQuandidadeDeItens());
        itemSalvar.setProduto(itemDTO.getProduto());

        Item produtoEncontrado = null;

        for(int i = 0; i < listaDeItens.size(); i++ ) {
            if(listaDeItens.get(i).getProduto().equals(itemSalvar.getProduto())){
                listaDeItens.get(i).setQuandidadeDeItens();
            }

        }
        if (produtoEncontrado == null) {
            listaDeItens.add(itemSalvar);
        }

    }
}
