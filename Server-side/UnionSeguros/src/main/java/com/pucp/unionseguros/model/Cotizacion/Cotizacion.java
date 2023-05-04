/*
Nombre del archivo:    Cotizacion
Autor:                Sergio Dadic
Descripcion:        Archivo model de la clase Cotizacion
*/

package com.pucp.unionseguros.model.Cotizacion;

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
import java.util.ArrayList;
import java.util.Date;
@Entity
@Table(name = "cotizacion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cotizacion", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fid_moneda")
    private Moneda fidMoneda;

    @Column(name = "fecha_cotizacion")
    private LocalDate fechaCotizacion;

    @Column(name = "monto_estimado", precision = 10, scale = 2)
    private double montoEstimado;

    @Column(name = "activo")
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "fid_distrito")
    private Distrito fidDistrito;





}
