/*
Nombre del archivo:    CotizacionXDetalleCotizacion
Autor:                Tadeo Gallegos
Descripcion:        Archivo model de la clase CotizacionXDetalleCotizacion
*/


package com.pucp.unionseguros.model.Cotizacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cotizacion_x_detalle_cotizacion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CotizacionXDetalleCotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cotizacion_x_detalle_cotizacion", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fid_detalle_cotizacion")
    private DetalleCotizacion fidDetalleCotizacion;

    @ManyToOne
    @JoinColumn(name = "fid_cotizacion")
    private Cotizacion fidCotizacion;
}
