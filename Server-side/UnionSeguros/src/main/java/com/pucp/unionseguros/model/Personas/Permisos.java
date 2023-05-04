/*
Nombre del archivo:    Permisos
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase Permisos
*/
package com.pucp.unionseguros.model.Personas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "permisos")
@NoArgsConstructor
@AllArgsConstructor
public class Permisos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permiso", nullable = false)
    private Integer id;

    @Column(name = "descripcion", length = 100)
    private String descripcion;

    @Column(name = "activo")
    private boolean activo;
}
