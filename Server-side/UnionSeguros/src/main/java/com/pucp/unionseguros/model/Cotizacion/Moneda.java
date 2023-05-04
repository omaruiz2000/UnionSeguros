/*
Nombre del archivo:    Moneda
Autor:                Jarumy Novoa
Descripcion:        Archivo model de la clase Moneda
*/

package com.pucp.unionseguros.model.Cotizacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "moneda")
@AllArgsConstructor
@NoArgsConstructor
public class Moneda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_moneda", nullable = false)
    private Integer id;

    @Column(name = "nombre_moneda", length = 20)
    private String nombreMoneda;

    @Column(name = "abreviatura", length = 10)
    private String abreviatura;

    @Column(name = "activo")
    private Byte activo;

}
