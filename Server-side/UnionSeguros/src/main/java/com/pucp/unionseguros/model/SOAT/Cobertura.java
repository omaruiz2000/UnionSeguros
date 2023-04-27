package com.pucp.unionseguros.model.SOAT;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "cobertura")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cobertura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cobertura", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "descripcion", length = 100)
    private String descripcion;

    @Column(name = "costo", precision = 10, scale = 2)
    private double costo;

    @Column(name = "activo")
    private boolean activo;

}
