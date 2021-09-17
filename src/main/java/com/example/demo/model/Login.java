package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdLogin;

    @Column(name = "usuario", nullable = false)
    private String usuario;

    @Column(name = "clave", nullable = false)
    private String clave;

}
