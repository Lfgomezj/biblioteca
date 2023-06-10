package com.example.biblioteca.Entidades;

import jakarta.persistence.*;

@Entity
@Table (name="editorial")

public class Editorial {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nombre",nullable = false, length =50 )
    private String nombre;
    @Column(name="descripcion",nullable = false, length =50 )
    private String descripcion;

    public Editorial(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Editorial() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
