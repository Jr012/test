package com.alimentos.controllers;

import com.alimentos.entity.Categoria;
import com.alimentos.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "alimentos/categorias")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> obtenerTodasCategorias(){
        return categoriaService.getCategorias();
    }
}
