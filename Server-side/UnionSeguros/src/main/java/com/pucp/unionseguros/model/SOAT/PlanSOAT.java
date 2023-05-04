/*
Nombre del archivo:    PlanSOAT
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase PlanSOAT
*/
package com.pucp.unionseguros.model.SOAT;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "plan_soat")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlanSOAT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plan_soat", nullable = false)
    private Integer id;

    @Column(name = "cobertura", precision = 10, scale = 2)
    private double cobertura;

    @Column(name = "precio", precision = 10, scale = 2)
    private double precio;

    @Column(name = "nombre_plan")
    private String nombrePlan;

    @Column(name = "activo")
    private boolean activo;

}
