package com.alimentos.repository;

import com.alimentos.entity.Ingredientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientesRepository extends JpaRepository<Ingredientes, Integer> {
}
