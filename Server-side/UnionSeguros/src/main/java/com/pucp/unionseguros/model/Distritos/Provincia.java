/*
Nombre del archivo:    Provincia
Autor:                Andrea Mejia
Descripcion:        Archivo model de la clase Provincia
*/

package com.pucp.unionseguros.model.Distritos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "provincia")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provincia", nullable = false)
    private Integer id;

    @Column(name = "nombre_provincia", length = 30)
    private String nombreProvincia;

    @Column(name = "activo")
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "fid_departamento")
    private Departamento fidDepartamento;

}
