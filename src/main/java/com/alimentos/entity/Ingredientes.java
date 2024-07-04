package com.alimentos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredientes")
public class Ingredientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String unidad_de_medidas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad_de_medidas() {
        return unidad_de_medidas;
    }

    public void setUnidad_de_medidas(String unidad_de_medidas) {
        this.unidad_de_medidas = unidad_de_medidas;
    }

    public Ingredientes() {
    }

    public Ingredientes(int id, String unidad_de_medidas, String descripcion) {
        this.id = id;
        this.unidad_de_medidas = unidad_de_medidas;
        this.descripcion = descripcion;
    }
}
