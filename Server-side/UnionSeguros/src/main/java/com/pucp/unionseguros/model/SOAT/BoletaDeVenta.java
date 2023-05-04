/*
Nombre del archivo:    BoletaDeVenta
Autor:                Andrea Mejia
Descripcion:        Archivo model de la clase BoletaDeVenta
*/

package com.pucp.unionseguros.model.SOAT;

import com.pucp.unionseguros.model.Distritos.Distrito;
import com.pucp.unionseguros.model.Personas.Cliente;
import com.pucp.unionseguros.model.Vehiculo.Vehiculo;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "boleta_de_venta")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BoletaDeVenta{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boleta", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fid_soat")
    private SOAT fidSoat;

    @Column(name = "fecha_emision")
    private LocalDate fechaEmision;

    @Column(name = "monto", precision = 10, scale = 2)
    private BigDecimal monto;

    @Column(name = "activo")
    private boolean activo;

}
