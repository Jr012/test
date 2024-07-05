package com.alimentos.controllers;

import com.alimentos.entity.Comidas;
import com.alimentos.entity.Ingredientes;
import com.alimentos.entity.Ingredientes_De_Comida;
import com.alimentos.service.IngredientesDeComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "alimentos/ingredientesDeComida")
public class IngredientesDeComidaController {
    @Autowired
    IngredientesDeComidaService ingredientesDeComidaService;

    @GetMapping("/{idingredienteDeComida}")
    public List<Ingredientes_De_Comida> obtenerIngredienteComida(@PathVariable("idingredienteDeComida") int idingredienteDeComida){
        return ingredientesDeComidaService.getIngredietesPorComida(idingredienteDeComida);
    }

    @DeleteMapping("/{ingredienteDeComidaId}")
    public void eliminar(@PathVariable("ingredienteDeComidaId") int ingredienteDeComidaId ){
        ingredientesDeComidaService.deleteIdComidas(ingredienteDeComidaId);
    }
}
