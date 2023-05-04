/*
Nombre del archivo:    TipoUso
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase TipoUso
*/

package com.pucp.unionseguros.model.Vehiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_uso")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TipoUso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_uso", nullable = false)
    private Integer idTipoUso;

    @Column(name = "nombre_tipo_uso", length = 30)
    private String nombreTipoUso;

    @Column(name = "activo")
    private boolean activo;


}

