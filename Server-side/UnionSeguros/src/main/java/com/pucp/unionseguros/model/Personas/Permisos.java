package com.pucp.unionseguros.model.Personas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column(name = "id_permiso", nullable = false)
    private Integer id;

    @Column(name = "descripcion", length = 100)
    private String descripcion;

    @Column(name = "activo")
    private boolean activo;
}
