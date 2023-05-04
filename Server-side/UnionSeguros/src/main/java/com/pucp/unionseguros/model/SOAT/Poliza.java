/*
Nombre del archivo:    Poliza
Autor:                Tadeo Gallegos
Descripcion:        Archivo model de la clase Poliza
*/

package com.pucp.unionseguros.model.SOAT;

import com.pucp.unionseguros.model.Cotizacion.Moneda;
import com.pucp.unionseguros.model.Distritos.Distrito;
import com.pucp.unionseguros.model.Personas.Cliente;
import com.pucp.unionseguros.model.Vehiculo.Vehiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "poliza")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Poliza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_poliza", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fid_moneda")
    private Moneda fidMoneda;

    @ManyToOne
    @JoinColumn(name = "fid_metodo")
    private MetodoDePago fidMetodo;

    @ManyToOne
    @JoinColumn(name = "fid_vehiculo")
    private Vehiculo fidVehiculo;

    @ManyToOne
    @JoinColumn(name = "fid_cliente")
    private Cliente fidCliente;

    @Column(name = "precio_base", precision = 10, scale = 2)
    private double precioBase;

    @Column(name = "fecha_vigencia_desde")
    private LocalDate fechaVigenciaDesde;

    @Column(name = "fecha_vigencia_fin")
    private LocalDate fechaVigenciaFin;

    @Column(name = "activo")
    private boolean activo;



}
