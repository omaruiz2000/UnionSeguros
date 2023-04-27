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
    @Column(name = "id_provincia", nullable = false)
    private Integer id;

    @Column(name = "nombre_provincia", length = 30)
    private String nombreProvincia;

    @Column(name = "activo")
    private boolean activo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fid_departamento")
    private Departamento fidDepartamento;

}
