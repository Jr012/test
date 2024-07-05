package com.alimentos.controllers;


import com.alimentos.entity.Ingredientes;
import com.alimentos.service.IngredientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "alimentos/ingredientes")
public class IngredientesController {
    @Autowired
    IngredientesService ingredientesService;

    @GetMapping
    public List<Ingredientes> obtenerTodosingredientes(){
        return ingredientesService.getIngredientes();
    }

}
