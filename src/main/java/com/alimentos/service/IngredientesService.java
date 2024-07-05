package com.alimentos.service;

import com.alimentos.entity.Ingredientes;
import com.alimentos.repository.IngredientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientesService {

    @Autowired
    IngredientesRepository ingredientesRepository;

    public List<Ingredientes> getIngredientes(){
        return ingredientesRepository.findAll();
    }
}
