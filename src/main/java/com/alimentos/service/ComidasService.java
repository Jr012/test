package com.alimentos.service;

import com.alimentos.DTO.ComidasDTO;
import com.alimentos.DTO.IngredienteDTO;
import com.alimentos.entity.Comidas;
import com.alimentos.entity.Ingredientes;
import com.alimentos.entity.Ingredientes_De_Comida;
import com.alimentos.repository.ComidasRepository;
import com.alimentos.repository.IngredientesDeComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComidasService {

    @Autowired
    ComidasRepository comidasRepository;
    @Autowired
    IngredientesDeComidaRepository ingredientesDeComidaRepository;

    public List<Comidas> getComidas(){
        return comidasRepository.findAll();
    }

    public Optional<Comidas> getIdComida(int id){
        Optional<Comidas> comida = comidasRepository.findById(id);
        return comida;
    }


    public void saveUp(ComidasDTO comida){
        Comidas comidasEntity = new Comidas();
        comidasEntity.setId(comida.getId());
        comidasEntity.setNombre(comida.getNombre());
        comidasEntity.setReceta(comida.getReceta());
        comidasEntity.setCategoria(comida.getCategoria());
        Comidas comidaCreada = comidasRepository.save(comidasEntity);
        if (comida.getId() > 0) borrarIngredientesComida(comida.getId());
        List<IngredienteDTO> ingredientes = comida.getIngredientes();
        for (IngredienteDTO ingrediente : ingredientes) {
            Ingredientes_De_Comida ingredientes_De_Comida = new Ingredientes_De_Comida();
            Ingredientes ingredienteEntity = new Ingredientes();
            ingredienteEntity.setId(ingrediente.getIngredienteId());
            ingredientes_De_Comida.setIngredienteId(ingredienteEntity);
            ingredientes_De_Comida.setComidaId(comidaCreada);
            ingredientes_De_Comida.setCantidad(ingrediente.getCantidad());

            ingredientesDeComidaRepository.save(ingredientes_De_Comida);
        }

    }
    private void borrarIngredientesComida(int id){
        List<Ingredientes_De_Comida> ingredientes= ingredientesDeComidaRepository.buscaPorComida(id);
        for(Ingredientes_De_Comida ingrediente: ingredientes ){
            ingredientesDeComidaRepository.deleteById(ingrediente.getId());
        }
    }


    public void deleteIdComida(int id){
        comidasRepository.deleteById(id);
    }
}
