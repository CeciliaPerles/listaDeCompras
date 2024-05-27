package com.lista.listaDeCompras.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lista.listaDeCompras.DTO.ItemDTO;
import com.lista.listaDeCompras.DTO.RemoverItemDTO;
import com.lista.listaDeCompras.services.ListaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //expor endpoints
@RequestMapping("/lista")
public class ListaController {

    private final ListaService listaService;
//    //injeção de dependência:
//    É uma forma de aplicar inversão de controle em uma classe que utiliza funcionalidades de outras
//    classes, tirando a responsabilidade dela de instanciar ou buscar objetos dessas outras classes das
//    quais ela depende.
//    Então o objetivo é não instanciar objetos que realizam funções que podem futuramente ser alteradas
//    dentro de uma classe e sim deixar a responsabilidade dessa instanciação para quem chama a classe.
    public ListaController(ListaService listaService) {
        this.listaService = listaService;
    }
    @GetMapping
    public List<ItemDTO> buscarItens() {
        return listaService.buscarItens();
    }
    @PostMapping("/adicionaritem")
    public void adicionarItemNaLista(@RequestBody ItemDTO itemDTO){
        listaService.adicionarItemNaLista(itemDTO);

    }

    @PostMapping("/removeritem")
    public void removerItemDaLista(@RequestBody RemoverItemDTO removerItemDTO){
        listaService.removerItemDaLista(removerItemDTO);

    }

}
