package com.example.mspracticante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class Practicante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer dni;
    private String correo;
    private String celular;
    private String genero;
    private Integer codigo;
    private Date fechainicio;
    private Date fechafin;
}
