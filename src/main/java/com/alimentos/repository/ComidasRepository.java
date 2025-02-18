package com.alimentos.repository;

import com.alimentos.entity.Comidas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComidasRepository extends JpaRepository<Comidas, Integer> {
}
