/*
Nombre del archivo:    Vehiculo
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase Vehiculo
*/

package com.pucp.unionseguros.model.Vehiculo;

import com.pucp.unionseguros.model.Personas.Persona;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "vehiculo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fid_tipo_uso")
    private TipoUso fidTipoUso;

    @ManyToOne
    @JoinColumn(name = "fid_modelo")
    private Modelo fidModelo;

    @ManyToOne
    @JoinColumn(name = "fid_persona")
    private Persona fidPersona;

    @Column(name = "anho_fabricacion")
    private LocalDate anhoFabricacion;

    @Column(name = "numero_asientos")
    private Integer numeroAsientos;

    @Column(name = "placa", length = 15)
    private String placa;

    @Column(name = "serie", length = 15)
    private String serie;

    @Column(name = "activo")
    private boolean activo;


}
