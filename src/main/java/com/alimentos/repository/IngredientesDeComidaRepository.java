package com.alimentos.repository;

import com.alimentos.entity.Ingredientes_De_Comida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientesDeComidaRepository extends JpaRepository<Ingredientes_De_Comida, Integer> {

    @Query("SELECT ingredienteComida FROM Ingredientes_De_Comida ingredienteComida WHERE ingredienteComida.comidaId.id = :idComida")
    List<Ingredientes_De_Comida> buscaPorComida(@Param("idComida")int idComida);
}
