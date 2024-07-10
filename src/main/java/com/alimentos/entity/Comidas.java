package com.alimentos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comidas")
public class Comidas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String receta;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Categoria categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Comidas() {
    }

    public Comidas(int id, String nombre, String receta, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.receta = receta;
        this.categoria = categoria;
    }
}
