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
    private Ingredientes  ingredienteId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Comidas comidaId;

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

    public Ingredientes getIngredienteId() {
        return ingredienteId;
    }

    public void setIngredienteId(Ingredientes ingredienteId) {
        this.ingredienteId = ingredienteId;
    }

    public Comidas getComidaId() {
        return comidaId;
    }

    public void setComidaId(Comidas comidaId) {
        this.comidaId = comidaId;
    }

    public Ingredientes_De_Comida() {
    }

    public Ingredientes_De_Comida(int id, double cantidad, Ingredientes ingredienteId, Comidas comidaId) {
        this.id = id;
        this.cantidad = cantidad;
        this.ingredienteId = ingredienteId;
        this.comidaId = comidaId;
    }
}
