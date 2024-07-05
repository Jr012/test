package com.alimentos.service;

import com.alimentos.entity.Ingredientes;
import com.alimentos.entity.Ingredientes_De_Comida;
import com.alimentos.repository.IngredientesDeComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientesDeComidaService {

    @Autowired
    IngredientesDeComidaRepository ingredientesDeComidaRepository;

    public List<Ingredientes_De_Comida> getIngredietesPorComida(int idComida){
        return ingredientesDeComidaRepository.buscaPorComida(idComida);
    }

    public void deleteIdComidas(int id){
        ingredientesDeComidaRepository.deleteById(id);
    }
}
