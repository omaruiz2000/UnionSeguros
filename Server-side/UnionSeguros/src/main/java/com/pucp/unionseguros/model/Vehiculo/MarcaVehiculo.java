/*
Nombre del archivo:    MarcaVehiculo
Autor:                Andrea Mejia
Descripcion:        Archivo model de la clase MarcaVehiculo
*/

package com.pucp.unionseguros.model.Vehiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "marca_vehiculo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MarcaVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca_vehiculo", nullable = false)
    private Integer id;

    @Column(name = "marca", length = 30)
    private String marca;

    @Column(name = "activo")
    private boolean activo;


}
