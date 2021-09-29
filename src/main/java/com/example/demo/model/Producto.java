package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column(name = "nombreArticulo", nullable = false, length = 70)
    private String nombreArticulo;

    @Column(name = "valor")
    private int valor;

    @Column(name = "cantidad")
    private int cantidad;
}
