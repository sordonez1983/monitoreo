/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gardaexport.monitoreo_flor.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ingreso")
public class Ingreso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String fecha;
    private Integer semana;
    private String tipoflor;
    private Integer numinvernadero;
    private Integer numnave;
    private Integer numcama;
    private Integer camevaluada;
    private String variedad;
    private String problema;
    private Integer cantidad;
    private String observaciones;
}