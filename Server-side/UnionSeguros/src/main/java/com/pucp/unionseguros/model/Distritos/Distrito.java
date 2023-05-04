/*
Nombre del archivo:    Distrito
Autor:                Tadeo Gallegos
Descripcion:        Archivo model de la clase Distrito
*/

package com.pucp.unionseguros.model.Distritos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "distrito")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito", nullable = false)
    private Integer id;

    @Column(name = "nombre_distrito", length = 30)
    private String nombreDistrito;

    @Column(name = "activo")
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "fid_provincia")
    private Provincia fidProvincia;


}
