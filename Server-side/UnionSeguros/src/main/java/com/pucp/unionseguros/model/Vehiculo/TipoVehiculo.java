/*
Nombre del archivo:    TipoVehiculo
Autor:                Tadeo Gallegos
Descripcion:        Archivo model de la clase TipoVehiculo
*/

package com.pucp.unionseguros.model.Vehiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_vehiculo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TipoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_vehiculo", nullable = false)
    private Integer idTipoVehiculo;

    @Column(name = "nombre_tipo_vehiculo", length = 30)
    private String nombreTipoVehiculo;

    @Column(name = "activo")
    private boolean activo;



}
