package com.lista.listaDeCompras.services;
import com.lista.listaDeCompras.DTO.ItemDTO;
import com.lista.listaDeCompras.models.Item;
import com.lista.listaDeCompras.models.Produto;

import java.util.*;

public class ListaService {

    List<Item> listaDeItens = new ArrayList<>();

    public void adicionarItemNaLista(ItemDTO itemDTO){

        Item produtoEncontrado = null;

        for(int i = 0; i < listaDeItens.size(); i++ ) {
            if(listaDeItens.get(i).getProduto().equals(itemDTO.getProduto())){
                produtoEncontrado = listaDeItens.get(i);
            }
        }

        if (produtoEncontrado == null) {
            Item itemSalvar = new Item();

            itemSalvar.setProduto(itemDTO.getProduto());
            itemSalvar.setQuandidadeDeItens(itemDTO.getQuandidadeDeItens());
            listaDeItens.add(itemSalvar);
        } else {
            produtoEncontrado.setQuandidadeDeItens(itemDTO.getQuandidadeDeItens());
        }

    }

    public void removerItemDaLista(ItemDTO itemDTO){

        Item itemApagar = new Item();
        itemApagar.setProduto(itemDTO.getProduto());
        itemApagar.setQuandidadeDeItens(itemDTO.getQuandidadeDeItens());

        if(listaDeItens.contains(itemApagar)){
            listaDeItens.remove(itemApagar);
        }
    }
}
