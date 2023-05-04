/*
Nombre del archivo:    Departamento
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase Departamento
*/

package com.pucp.unionseguros.model.Distritos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "departamento")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento", nullable = false)
    private Integer id;

    @Column(name = "nombre_departamento", length = 30)
    private String nombreDepartamento;

    @Column(name = "activo")
    private boolean activo;


}
