/*
Nombre del archivo:    Usuario
Autor:                Tadeo Gallegos
Descripcion:        Archivo model de la clase Usuario
*/

package com.pucp.unionseguros.model.Personas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id_persona")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends Persona{

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "contrasena", length = 30)
    private String contrasena;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    @Column(name = "activo")
    private boolean activoUsuario;

}
