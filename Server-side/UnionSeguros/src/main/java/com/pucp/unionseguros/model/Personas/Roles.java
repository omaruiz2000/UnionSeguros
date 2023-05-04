/*
Nombre del archivo:    Roles
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase Roles
*/
package com.pucp.unionseguros.model.Personas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_roles", nullable = false)
    private Integer idRole;

    @Column(name = "descripcion", length = 100)
    private String descripcion;

    @Column(name = "activo")
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "fid_permisos")
    private Permisos fidPermisos;
}
