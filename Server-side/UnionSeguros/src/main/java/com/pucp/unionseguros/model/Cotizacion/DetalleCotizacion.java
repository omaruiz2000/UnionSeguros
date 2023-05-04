/*
Nombre del archivo:    DetalleCotizacion
Autor:                Andrea Mejia
Descripcion:        Archivo model de la clase DetalleCotizacion
*/

package com.pucp.unionseguros.model.Cotizacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_cotizacion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetalleCotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_cotizacion", nullable = false)
    private Integer id;

    @Column(name = "beneficio", length = 30)
    private String beneficio;

    @Column(name = "monto", precision = 10, scale = 2)
    private BigDecimal monto;

    @Column(name = "activo")
    private boolean activo;

}
