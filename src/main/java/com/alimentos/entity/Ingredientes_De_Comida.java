package com.alimentos.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Ingredientes_De_Comida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private double cantidad;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Ingredientes ingredientes;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Comidas comidas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Comidas getComidas() {
        return comidas;
    }

    public void setComidas(Comidas comidas) {
        this.comidas = comidas;
    }

    public Ingredientes_De_Comida() {
    }

    public Ingredientes_De_Comida(int id, double cantidad, Ingredientes ingredientes, Comidas comidas) {
        this.id = id;
        this.cantidad = cantidad;
        this.ingredientes = ingredientes;
        this.comidas = comidas;
    }
}
