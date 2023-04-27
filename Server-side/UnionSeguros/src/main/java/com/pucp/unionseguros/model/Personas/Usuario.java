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
public class Usuario {


    @Id
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Persona persona;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "`contraseña`", length = 30)
    private String contraseña;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    @Column(name = "activo")
    private boolean activo;

}
