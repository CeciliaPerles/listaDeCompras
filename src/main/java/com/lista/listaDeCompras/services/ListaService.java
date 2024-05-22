package com.lista.listaDeCompras.services;
import com.lista.listaDeCompras.DTO.ItemDTO;
import com.lista.listaDeCompras.DTO.RemoverItemDTO;
import com.lista.listaDeCompras.models.Item;
import com.lista.listaDeCompras.models.Produto;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ListaService {
    List<Item> listaDeItens = new ArrayList<>();

    public List<ItemDTO> buscarItens(){
        List<ItemDTO> listaDeItensDTO = new ArrayList<>();

        for(int i = 0; i < listaDeItens.size(); i++){
           ItemDTO itemDTOConvertido = this.converterItemParaDTO(listaDeItens.get(i));
           listaDeItensDTO.add(itemDTOConvertido);
        }

        return listaDeItensDTO;
    }
    public void adicionarItemNaLista(ItemDTO itemDTO) {

        Item produtoEncontrado = null;

        for (int i = 0; i < listaDeItens.size(); i++) {
            if (listaDeItens.get(i).getProduto().equals(itemDTO.getProduto())) {
                produtoEncontrado = listaDeItens.get(i);
            }
        }

        if (produtoEncontrado == null) {
            Item itemSalvar = this.converterDTOParaItem(itemDTO);
            listaDeItens.add(itemSalvar);
        } else {
            produtoEncontrado.setQuandidadeDeItens(itemDTO.getQuantidadeDeItens());
        }

    }

    public void removerItemDaLista(RemoverItemDTO removerItemDTO) {

        for(int i = 0; i < listaDeItens.size(); i++){
            if (listaDeItens.get(i).getProduto().equals(removerItemDTO.getProduto())){
                listaDeItens.remove(i);
            }
        }

    }

    public Item converterDTOParaItem(ItemDTO itemDTO) {
        Item DTOConvertidoParaItem = new Item();
        DTOConvertidoParaItem.setProduto(itemDTO.getProduto());
        DTOConvertidoParaItem.setQuandidadeDeItens(itemDTO.getQuantidadeDeItens());
        return DTOConvertidoParaItem;
    }

    public ItemDTO converterItemParaDTO(Item item) {
        ItemDTO itemConvertidoParaDTO = new ItemDTO();
        itemConvertidoParaDTO.setProduto(item.getProduto());
        itemConvertidoParaDTO.setQuantidadeDeItens(item.getQuandidadeDeItens());
        return itemConvertidoParaDTO;
    }
}